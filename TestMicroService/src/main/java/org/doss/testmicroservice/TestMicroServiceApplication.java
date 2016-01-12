package org.doss.testmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroServiceApplication.class, args);
	}
}
