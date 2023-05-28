package com.freshvotes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class WebSecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return passwordEncoder();
		
//		this @Bean class will store the password in encrypted form using 
//		.password(passwordEncoder().encode("asdfasdf"))
	}
	
	@Bean
	public UserDetailsService userDetailService() {
		
		UserDetails normalUser = User
				.withUsername("Aftab")
				.password(passwordEncoder().encode("asdfasdf"))
				.roles("NORMAL")
				.build();
		
		UserDetails adminUser = User
				.withUsername("Aftab1")
				.password(passwordEncoder().encode("59512981"))
				.roles("ADMIN")
				.build();
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(normalUser, adminUser);
//		InMemoryUserDetailsManager is an implementation of the UserDetailManager interface
		
		return inMemoryUserDetailsManager;
	}
	
	
	
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
