import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;
import akka.routing.RoundRobinPool;

public class RouteActor extends AbstractActor {

    /*private ActorRef executeActor;
    private ActorRef storageActor;*/

    public RouteActor() {
        TestExecuteActor.executeActor = getContext().actorOf(new RoundRobinPool(5)
                .props(Props.create(TestExecuteActor.class)));

        StoreActor.storeActor = getContext().actorOf(Props.create(StoreActor.class));
    }

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(JSObject.class, message -> {
                    for (JSTest test : message.getTests()) {
                        JSTestMessage jsTestMessage = new JSTestMessage(
                                message.getPackageId(),
                                message.getJsScript(),
                                message.getFunctionName(),
                                test);
                        TestExecuteActor.executeActor.tell(jsTestMessage, self());
                    }
                })
                .match(Message.class, message -> StoreActor.storeActor.tell(message, sender()))
                .build();
    }

    /*public ActorRef getStorageActor() {
        return storageActor;
    }

    public ActorRef getExecuteActor() {
        return executeActor;
    }*/
}
