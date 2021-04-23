package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
////		auth.inMemoryAuthentication().withUser("SAM").password("{noop}SAM").authorities("STUDENT");
////		auth.inMemoryAuthentication().withUser("KHAN").password("{noop}KHAN").authorities("EMPLOYEE");
////		auth.inMemoryAuthentication().withUser("RAM").password("{noop}RAM").authorities("ADMIN");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
////		super.configure(http);
//		//authorize urls
////		http.authorizeRequests()
////		.antMatchers("/welcome").permitAll()
////		.antMatchers("/common").authenticated()
////		.antMatchers("/adm").hasAuthority("ADMIN")
////		.antMatchers("/std").hasAuthority("STUDENT")
////		.antMatchers("/emp").hasAuthority("EMPLOYEE")
////		.anyRequest().authenticated()
////		//login form details
////		.and()
////		.formLogin()
////		.defaultSuccessUrl("/common", true)
////		//logout
////		.and()
////		.logout();
//		//wrong url access with different roles
//	}
//}
