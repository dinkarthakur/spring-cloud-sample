package com.doss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DossEdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DossEdgeServerApplication.class, args);
	}
}
