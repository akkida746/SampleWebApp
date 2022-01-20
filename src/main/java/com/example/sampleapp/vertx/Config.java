package com.example.sampleapp.vertx;

import io.vertx.core.Vertx;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class Config {
    @Bean
    public Vertx createVertx() {
        Vertx vertx = Vertx.vertx();
        //vertx.eventBus().registerDefaultCodec(User.class, new UserMessageCodec());
        return vertx;
    }
}
