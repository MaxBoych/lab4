import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class TestExecuteActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(JSTestMessage.class, message -> {
                    
                })
    }
}
