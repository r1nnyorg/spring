public class Server
{
    public static org.reactivestreams.Publisher<java.lang.Void> ajax(final reactor.netty.http.server.HttpServerRequest request, final reactor.netty.http.server.HttpServerResponse response)
    {
        return response.sendString(reactor.core.publisher.Mono.just("Hello World!")));
    }
    
    public static void main(final java.lang.String[] args)
    {
        final var server = reactor.netty.http.server.HttpServer.create().route(routes -> routes.get("ajax", Server::ajax)).port(80).bindNow();
        server.onDispose().block();
    }
}
