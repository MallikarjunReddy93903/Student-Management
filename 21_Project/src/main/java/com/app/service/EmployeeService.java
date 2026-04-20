package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repository.EmployeeRepository;
@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository  employeeRepository= null;
  
	
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> lm = employeeRepository.findAll();
		return lm;
	}
	
	
	public Employee addEmployee(Employee employee)
	{
		Employee e = employeeRepository.save(employee);
		return e;
	}
	
	public void deleteEmployee(Integer id)
	{
		employeeRepository.deleteById(id);
	
	}
	
	public Employee updateEmployee(Integer id)
	{
		return employeeRepository.findById(id).get();
	}
}
