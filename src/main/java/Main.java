import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.Route;
import akka.stream.ActorMaterializer;

import static akka.http.javadsl.server.Directives.route;

public class Main {
    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("main");
        ActorRef mainActor = system.actorOf(Props.create(MainActor.class));

        Http http = Http.get(system);
        ActorMaterializer materializer = ActorMaterializer.create(system);
    }
}
