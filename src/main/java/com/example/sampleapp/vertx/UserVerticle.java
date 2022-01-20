package com.example.sampleapp.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Verticle;
import java.util.UUID;

public class UserVerticle extends AbstractVerticle implements Verticle {

    private String username = "Akash";

    @Override
    public void start() throws Exception {

        vertx.eventBus().consumer("user",m -> {
            User r = new User(UUID.randomUUID().toString(),username);
            m.reply(r);
        });

    }
}
