import akka.actor.ActorRef;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.server.Route;
import akka.pattern.Patterns;

import scala.concurrent.Future;

import static akka.http.javadsl.server.Directives.*;

public class JSRouter {

    public Route jsRoute(ActorRef actor) {
        return route(

                get(() -> parameter("message", message -> {
                    Future<Object> getResult = Patterns.ask(actor, new Message(message), 5000);
                    return completeOKWithFuture(getResult, Jackson.marshaller());
                })),

                post(() -> entity(Jackson.unmarshaller(JSObject.class), message -> {
                    actor.tell(message, ActorRef.noSender());
                    return complete("message replied");
                }))
        );
    }
}
