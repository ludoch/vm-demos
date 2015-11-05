package hello;

import io.vertx.core.Vertx;


public class Application {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx().createHttpServer().requestHandler(req -> 
            req.response().end("Hello DevFest Nantes!, I am a VertX application!"))
            .listen(8080);
  }

}