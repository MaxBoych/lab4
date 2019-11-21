import akka.actor.ActorRef;
import akka.http.javadsl.server.Route;
import akka.pattern.Patterns;

import java.util.concurrent.Future;

import static akka.http.javadsl.server.Directives.*;

public class JSRouter {

    public Route jsRoute(ActorRef actor) {
        return route(
                get(() -> parameter("message", m -> {
                    Future<Object> res = Patterns.ask(actor, new Message(), 5000);
                    return 
                }))
        );
    }
}
