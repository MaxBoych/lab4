import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.List;

public class TestExecuteActor extends AbstractActor {

    public static ActorRef executeActor;

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(JSTestMessage.class, message -> {
                    JSTest test = message.getTest();
                    Object[] params = test.getParams();

                    ScriptEngine engine = new ScriptEngineManager().getEngineByName(Config.SCRIPT_ENGINE_NAME);
                    engine.eval(message.getJsScript());
                    Invocable invocable = (Invocable) engine;
                    String result = invocable.invokeFunction(message.getFunctionName(), params).toString();
                    boolean isExpected = result.equals(test.getExpectedResult());

                    JSExecuteMessage storeMessage = new JSExecuteMessage(
                            message.getPackageId(),
                            new JSExecute(
                                    test.getTestName(),
                                    test.getExpectedResult(),
                                    test.getParams(),
                                    result,
                                    isExpected)
                    );

                    StoreActor.storeActor.tell(storeMessage, ActorRef.noSender());
                })
                .build();
    }
}
