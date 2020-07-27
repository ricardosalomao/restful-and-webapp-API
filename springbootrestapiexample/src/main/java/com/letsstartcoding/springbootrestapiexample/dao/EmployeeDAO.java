package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an Employee*/
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		
	}
	
	/*search all Employees*/
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	/*get an Employee*/
	public Employee findOne(Long empid) {
		return employeeRepository.findById(empid).get();
	}
	
	/*get an Employee*/
	public Optional<Employee> findById(Long empid) {
		return employeeRepository.findById(empid);
	}
	
	/*delete an Employee*/
	public void delete (Employee emp) {
		employeeRepository.delete(emp);
	}
}
