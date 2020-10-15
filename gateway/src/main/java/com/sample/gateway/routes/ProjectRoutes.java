package com.sample.gateway.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.security.oauth2.gateway.TokenRelayGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Routes specific to Projects resource server</br>
 * Routes can be loaded from Java DSL/configuration/databases but starting Java DSL as of now.
 */
@Configuration
public class ProjectRoutes {

	@Autowired
	private TokenRelayGatewayFilterFactory filterFactory;

	@Bean
	public RouteLocator projectRoutesList( RouteLocatorBuilder routeLocBuilder ) {

//		return routeLocBuilder.routes()
//				.route( r -> r.path("/get") .uri( "http://httpbin.org:80" ) )
//				.route( r -> r.host( "*.myhost.org" ) .uri( "http://httpbin.org:80" ) )
//				.build();

		return routeLocBuilder.routes()
				.route( "resource", r -> r.path("/api/ast/projects")
				//.route( "resource", r -> r.path( "/resource" )
						.filters( f -> f.filter( filterFactory.apply() ) )
						.uri( "http://localhost:9000" ) )
				.route( "feRoute", rfe -> rfe.path( "/**" )
						.filters( ffe -> ffe.filter( filterFactory.apply() ) )
						.uri( "http://localhost:8091" ) )
				.build();
	}
}