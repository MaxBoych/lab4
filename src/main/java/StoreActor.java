import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoreActor extends AbstractActor {
    private Map<String, ArrayList<JSExecuteMessage>> store = new HashMap<>();

    @Override
    public Receive createReceive() {

        return ReceiveBuilder.create()
                .match(JSExecuteMessage.class, message -> {
                    if (store.containsKey(message.getPackageId())) {
                        store.get(message.getPackageId()).add(message);
                    } else {
                        ArrayList<JSExecuteMessage> list = new ArrayList<>();
                        list.add(message);
                        store.put(message.getPackageId(), list);
                    }
                })
                .match(Message.class, message -> {
                            ArrayList<JSExecuteMessage> list = store.get(message.getTestName());

                            if (list != null) {
                                sender().tell(list.toArray(), ActorRef.noSender());
                            }
                        }
                ).build();
    }
}