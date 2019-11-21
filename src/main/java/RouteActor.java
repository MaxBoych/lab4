import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class RouteActor extends AbstractActor {

    private ActorRef executeActor;
    private ActorRef storageActor;

    public RouteActor() {
        executeActor = getContext().actorOf(new RoundeRobinPool())
    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
