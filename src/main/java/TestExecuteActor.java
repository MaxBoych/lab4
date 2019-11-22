import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;

public class TestExecuteActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(JSTestMessage.class, message -> {
                    JSTest test = message.getTest();
                    ArrayList<Object> params = test.getParams();

                    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
                    engine.eval(message.getJsScript());
                    Invocable invocable = (Invocable) engine;
                    String result = invocable.invokeFunction(message.getFunctionName(), params).toString();
                    boolean isExpected = result.equals(test.getExpectedResult());

                    JSExecuteMessage storeMessage = new JSExecuteMessage(message.getPackageId(), );

                    getSender().tell(storeMessage, ActorRef.noSender());
                })
                .build();
    }
}
