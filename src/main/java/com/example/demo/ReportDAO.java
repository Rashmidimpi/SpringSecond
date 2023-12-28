package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportDAO {
	public ReportDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("Report DAO :: Constructor");
	}

}
