package com.jc.microservice;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class ServerApplication {
	@Bean
	public Ignite cache() {
		Ignite ignite = Ignition.start("cache-server.xml");
		return ignite;
	}
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
