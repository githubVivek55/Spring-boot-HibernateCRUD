package com.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.model.Employee;
import com.hibernate.service.EmployeeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	EmployeeServiceImpl service;
	
	@RequestMapping(value="/")
	public String listEmployee(ModelMap model){
		List<Employee> list=service.findAllEmployee();
		model.addAttribute("employees",list);
		return "employee";
	}
	
	@RequestMapping(value="/new")
	public String newEmployee(ModelMap model){
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "registration";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee,BindingResult result,ModelMap model ){
		if(result.hasErrors()){
			return "registration";
		}
		service.saveEmployee(employee);
		return "registration";
	}
}
