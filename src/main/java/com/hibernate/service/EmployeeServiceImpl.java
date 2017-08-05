package com.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeDao employeedao;
	
	public List<Employee> findAllEmployee(){
		return employeedao.findAllEmployee();
	}
	
	public void saveEmployee(Employee employee){
		employeedao.addEmployee(employee);
	}
}
