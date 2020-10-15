package com.sample.project.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class ProjectResrcServerSecurityConfig {

	@Bean
	SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
		http
			.authorizeExchange()
				.pathMatchers("/api/ast/projects/**").hasAuthority("SCOPE_resource.read")
				.anyExchange().authenticated()
				.and()
			.oauth2ResourceServer()
				.jwt();
		
		return http.build();
	}
}
