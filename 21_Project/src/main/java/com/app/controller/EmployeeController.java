package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.Employee;
import com.app.service.EmployeeService;
@Controller

public class EmployeeController
{
	
	@Autowired
   private EmployeeService employeeService = null;
	
	
	
	
	     @GetMapping("/view") 
	public ModelAndView viewEmployee()
	{
	
	
	  ModelAndView mav = new ModelAndView();
	  
	  List<Employee> lm =employeeService.getAllEmployee();
		
	  mav.addObject("employees",lm);
	  mav.setViewName("view");
	  return mav;
	}
	     
	     @GetMapping("/signup")
	     
	     public ModelAndView addEmployee()
	     {
	    	 ModelAndView mav = new ModelAndView();
	    	 mav.addObject("employee", new Employee());
	    	 mav.setViewName("signup");
	    	 return mav;
	    	 
	     }
	     
	     
	     @PostMapping("/added")
	     public ModelAndView saveEmployee(Employee employee)
	     {
	    	 ModelAndView mav = new ModelAndView();
	    	 
	   Employee e = 	 employeeService.addEmployee(employee);
	   
	   if(e!=null)
	   {
		   
	   
	   mav.addObject("sucMsg"," Employee Saved Successfully");
	   }
	   else
	   {
		   mav.addObject("errMsg"," Employee Not Saved");
	   
	   }
	   
	   mav.setViewName("signup");
	   return mav;
	    	 
	     }
	     
	     
	     @GetMapping("/delete/{id}")
	     public ModelAndView delEmployee(@PathVariable("id") Integer id)
	     {
	    	 ModelAndView mav = new ModelAndView();
	    	 
	   employeeService.deleteEmployee(id);
	   List<Employee> lm =employeeService.getAllEmployee();
		
		  mav.addObject("employees",lm);
		  mav.setViewName("view");
		  return mav;
	  
		
	     }
	     
	     
	     @GetMapping("/edit/{id}")
	     public  ModelAndView editEmployee( @PathVariable("id") Integer id)
	     {
	    	    	 
	    Employee employee =	 employeeService.updateEmployee(id);
	    ModelAndView mav = new ModelAndView();
	    	 mav.addObject("employee",employee);
	    	 mav.setViewName("signup");
	    	 return mav;
	    	 
	    	 
	     }
	     
	     
	     

}
