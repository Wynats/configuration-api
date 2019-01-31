package com.wynats.arq.configurationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigurationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApiApplication.class, args);
	}
}
