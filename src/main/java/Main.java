import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.server.Route;

public class Main {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("main");
        ActorRef mainActor = system.actorOf(Props.create(MainActor.class));
    }

    private Route jsRoute() {
        
    }
}
