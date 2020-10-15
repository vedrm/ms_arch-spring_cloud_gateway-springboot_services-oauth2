package com.sample.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class FEResrcServerSecurityConfig {

	@Bean
	SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
		http
			.authorizeExchange()
				.pathMatchers("/**").hasAuthority("SCOPE_resource.read")
				.anyExchange().authenticated()
				.and()
			.oauth2ResourceServer()
				.jwt();
		
		return http.build();
	}
}
