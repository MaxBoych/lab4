import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.route;

public class JSRouter {

    public Route jsRoute() {
        return route(
                get()
        );
    }
}
