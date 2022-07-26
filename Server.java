public class Server
{
    public static void main(final java.lang.String[] args)
    {
        final var server = reactor.netty.http.server.HttpServer.create().handle((request, response) -> response.sendString(reactor.core.publisher.Mono.just("hello"))).bindNow();
        server.onDispose().block();
    }
}
