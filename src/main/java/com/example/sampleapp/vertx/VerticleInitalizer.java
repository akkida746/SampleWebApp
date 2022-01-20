package com.example.sampleapp.vertx;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class VerticleInitalizer {

    @Autowired
    private List<Verticle> availableVerticles;

    @Autowired
    private Vertx vertx;

    @PostConstruct
    private void initVerticles() {
        availableVerticles.forEach(vertx::deployVerticle);
    }

}
