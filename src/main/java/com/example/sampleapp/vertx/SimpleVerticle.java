package com.example.sampleapp.vertx;

import io.vertx.core.*;
import org.springframework.stereotype.Component;

@Component
public class SimpleVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> startPromise) {
        vertx.createHttpServer().requestHandler(request -> {
            String name = request.getParam("name");
            if (name == null) {
                request.response().setStatusCode(400).end("Missing name");
            } else {
                // It's fine to call the greeter from the event loop as it's not blocking
                request.response().end("Called..");
            }
        }).listen(8080, ar -> {
            if (ar.succeeded()) {
                startPromise.complete();
            } else {
                startPromise.fail(ar.cause());
            }
        });
    }
}
