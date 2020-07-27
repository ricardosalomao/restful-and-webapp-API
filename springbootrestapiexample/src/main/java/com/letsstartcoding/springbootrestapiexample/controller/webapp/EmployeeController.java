package com.letsstartcoding.springbootrestapiexample.controller.webapp;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;

@Controller
@RequestMapping("/employees/")
public class EmployeeController {
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping("showForm")
	public String showEmployeeForm(Employee emp) {
		return "add-employee";
	}
	
	@GetMapping("list")
	public String employees(Model model) {
		System.out.println("employees()");
		model.addAttribute("employees", this.employeeDAO.findAll());
		return "index";
	}
	
	@PostMapping("add")
	public String addEmployee(@Valid Employee emp, BindingResult result, Model model ) {
		if (result.hasErrors()) {
			return "add-employee";
		}
		this.employeeDAO.save(emp);
		return "redirect:list";
	}
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") Long empid, Model model) {
		Employee emp = this.employeeDAO.findById(empid)
				.orElseThrow(() -> new IllegalArgumentException("Invalid employee Id: "+ empid));
		model.addAttribute("employee", emp);
		return "update-employee";
	}
	
	@GetMapping("delete/{id}")
	public String deleteEmployee(@PathVariable ("id") Long empid, Model model) {
		
		Employee emp = this.employeeDAO.findById(empid)
				.orElseThrow(() -> new IllegalArgumentException("Invalid employee Id: "+ empid));
		this.employeeDAO.delete(emp);
		
		model.addAttribute("employees", this.employeeDAO.findAll());
		return "index";
		
	}
	
	@PostMapping("update/{id}")
	public String updateEmployee(@PathVariable("id") Long id, @Valid Employee emp, BindingResult result, Model model) {
		if(result.hasErrors()) {
			emp.setId(id);
			return "update-employee";
		}
		
		// update student
		employeeDAO.save(emp);
		
		// get all students ( with update)
		model.addAttribute("employees", this.employeeDAO.findAll());
		return "index";
	}
}
