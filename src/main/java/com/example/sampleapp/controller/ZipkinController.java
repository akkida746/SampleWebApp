package com.example.sampleapp.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.logging.Logger;

@RestController
class ZipkinController {

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @GetMapping(value="/zipkin")
    public String zipkinService1()
    {
        LOG.info("Inside zipkinService 1..");

        String response = (String) restTemplate.exchange("http://localhost:8081/zipkin2",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<String>() {})
                .getBody();
        return "Hi...";
    }
}