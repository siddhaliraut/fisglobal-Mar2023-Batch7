package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigs {
	
	/*
	@Bean
	public RouteLocator getwayRourter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/notes/**").uri("lb://NOTES-SERVICE/notes"))
				.route(p->p.path("/comments/**").uri("lb://COMMENT-SERVICE/comments"))
				.build();
	}
	*/
}