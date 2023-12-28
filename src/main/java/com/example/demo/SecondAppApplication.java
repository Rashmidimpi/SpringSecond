package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.mb"})
public class SecondAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SecondAppApplication.class, args);
		System.out.println(ctxt.getBeanDefinitionCount());
		System.out.println(ctxt.getClass().getName());
		ReportDAO bean1 = ctxt.getBean(ReportDAO.class);
		ReportDAO bean2 = ctxt.getBean(ReportDAO.class);
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
		
	}
	
	

}
