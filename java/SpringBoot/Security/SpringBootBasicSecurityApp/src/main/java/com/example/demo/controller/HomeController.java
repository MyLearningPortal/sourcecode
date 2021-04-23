package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	
	@GetMapping(value="/emp")
	public String showEmployeePage()
	{
		return "EmployeePage";
	}
	
	@GetMapping(value="/std")
	public String showStudentPage()
	{
		return "StudentPage";
	}
	
	@GetMapping(value="/adm")
	public String showAdminPage()
	{
		return "AdminPage";
	}
	
	@GetMapping(value="/common")
	public String showCommonPage()
	{
		return "CommonPage";
	}
	
	@GetMapping(value="/welcome")
	public String showWelcomePage()
	{
		return "WelcomePage";
	}
	
	@GetMapping(value="/denied")
	public String showDeniedPage()
	{
		return "DeniedPage";
	}
	
	
}
