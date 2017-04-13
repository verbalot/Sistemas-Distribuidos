package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	public UserRepositoryAuthenticationProvider authenticationProvider;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		
		// Paginas publicas
		http.authorizeRequests().antMatchers("/").permitAll();
		
		// Paginas privadas
		http.authorizeRequests().antMatchers("/").hasAnyRole("USER","ADMIN");
	}
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
    	auth.authenticationProvider(authenticationProvider);
	}
	

}
	
