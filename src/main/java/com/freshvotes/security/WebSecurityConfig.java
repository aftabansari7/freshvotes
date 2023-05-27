package com.freshvotes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//			this HttpSecurity class will help us control the access to various users.
		httpSecurity.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("home/public")
				.permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.formLogin();
			
		return httpSecurity.build();
	}

}
