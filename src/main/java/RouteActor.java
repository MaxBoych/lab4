import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;
import akka.routing.RoundRobinPool;

public class RouteActor extends AbstractActor {

    private ActorRef executeActor;
    private ActorRef storageActor;

    public RouteActor() {
        executeActor = getContext().actorOf(new RoundRobinPool(5)
                .props(Props.create(TestExecuteActor.class)));

        storageActor = getContext().actorOf(Props.create(StoreActor.class));
    }

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(JSObject.class, message -> {
                    for (JSTest test : message.getTests()) {
                        JSTestMessage jsTestMessage = new JSTestMessage(
                                message.getPackageId(),
                                test.getExpectedResult(),
                                test.getFunctionName(),
                                test);
                        executeActor.tell(jsTestMessage, self());
                    }
                })
                .match(Message.class, message -> storageActor.tell(message, sender()))
                .build();
    }
}
