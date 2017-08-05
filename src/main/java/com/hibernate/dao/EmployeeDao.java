package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Employee;

public interface EmployeeDao {

	public abstract List<Employee> findAllEmployee();
	
	public abstract void addEmployee(Employee employee);

}