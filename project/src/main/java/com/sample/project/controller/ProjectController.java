package com.sample.project.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.project.model.response.ProjectsResponse;
import com.sample.project.service.ProjectService;

@RestController
@RequestMapping( "/api/ast/projects" )
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@GetMapping
	public ResponseEntity<Object> fetchProjects( JwtAuthenticationToken jwtAuthentication ) {
		try {
			jwtAuthentication.getPrincipal();
			System.out.println( "jwtAuthentication = " + jwtAuthentication );
			
			List<String> authorities = jwtAuthentication.getAuthorities().stream().map( GrantedAuthority::getAuthority)
			.sorted().collect( Collectors.toList() );
			
			System.out.println( "authorities = " + authorities );
			Jwt jwt = jwtAuthentication.getToken();
			
			System.out.println( "jwt.getSubject() = " + jwt.getSubject() );
			System.out.println( "jwt.getTokenValue() = " + jwt.getTokenValue() );
			System.out.println( "jwt.getAudience() = " + jwt.getAudience() );
			System.out.println( "jwt.getClaims() = " + jwt.getClaims() );
			
			ProjectsResponse response = projectService.fetchProjects();
			return new ResponseEntity<>( response, HttpStatus.OK );
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
		}
	}
}
