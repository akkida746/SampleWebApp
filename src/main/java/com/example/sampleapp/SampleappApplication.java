package com.example.sampleapp;

import com.example.sampleapp.vertx.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Config.class)
public class SampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}

}
