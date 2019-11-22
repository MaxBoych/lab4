import akka.actor.AbstractActor;
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
                    engine.eval(message.getJs());
                    Invocable invocable = (Invocable) engine;
                    String res = invocable.invokeFunction(message.getFunctionName(), params).toString();

                    
                })
    }
}
