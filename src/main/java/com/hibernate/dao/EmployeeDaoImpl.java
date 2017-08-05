package com.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.hibernate.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer,Employee > implements EmployeeDao {
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployee(){
		Criteria criterion=createEntityCriteria();
		return (List<Employee>)criterion.list();
	}

	@Override
	public void addEmployee(Employee employee) {
		persist(employee);
	}
}
