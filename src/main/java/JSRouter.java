import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.Directives.*;

public class JSRouter {

    public Route jsRoute() {
        return route(
                get(() -> parameter("smth", smth -> {
                    
                }))
        );
    }
}
