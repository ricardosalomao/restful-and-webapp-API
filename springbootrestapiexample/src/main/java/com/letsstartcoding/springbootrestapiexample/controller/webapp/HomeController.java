package com.letsstartcoding.springbootrestapiexample.controller.webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.model.Login;

@Controller
public class HomeController {
//	@Autowired
//	EmployeeDAO employeeDAO;
//	
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public String addEmployee(Login log) {
//		if (log.getLogin().equals("admin") && log.getPassword().equals("admin")) {
//			System.out.println("Logged In....");
//			return "home";
//		}
//		System.out.println("Fail to Log In....");
//		return "index";
//	}
}