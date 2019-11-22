import akka.NotUsed;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.ConnectHttp;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;

import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

import static akka.http.javadsl.server.Directives.route;

public class Main {
    public static void main(String[] args) throws IOException {

        ActorSystem system = ActorSystem.create("main");
        ActorRef routeActor = system.actorOf(Props.create(RouteActor.class));

        Http http = Http.get(system);
        ActorMaterializer materializer = ActorMaterializer.create(system);

        Flow<HttpRequest, HttpResponse, NotUsed> flow = new JSRouter().jsRoute(routeActor)
                .flow(system, materializer);

        CompletionStage<ServerBinding> completionStage = http.bindAndHandle(
                flow,
                ConnectHttp.toHost("localhost", 8080),
                materializer
        );

        System.out.println("Server start at http://localhost:8080/");
        System.in.read();

        completionStage.thenCompose(ServerBinding::unbind)
                .thenAccept(sv -> system.terminate());
    }
}
