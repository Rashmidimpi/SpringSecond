package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class UserDAO {
	public UserDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("userdao :: constructor");
	}

}
