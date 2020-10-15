package com.sample.gateway.config;
///*
// * Copyright 2002-2019 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.sample.gateway.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class ResourceServerConfig extends WebSecurityConfigurerAdapter {
//
//	// @formatter:off
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests(authorizeRequests ->
//				authorizeRequests
//					.mvcMatchers("/api/**").access("hasAuthority('SCOPE_resource.read')")
//					.anyRequest().authenticated())
//			.oauth2ResourceServer(oauth2ResourceServer ->
//				oauth2ResourceServer
//					.jwt())
//			.oauth2Client();
//	}
//	// @formatter:on
//}