package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.security.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("Appconfig r:: constructor");
	}
	
	@Bean
	public AppSecurity createSecurityObj() {
		AppSecurity as = new AppSecurity("SHA-256");
		return as;
	}
}
