package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50)
	@Column(name = "empName", nullable = false)
	private String name;

	@Column(name = "ssn", unique = true, nullable = false)
	private String ssn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean flag=false;
		if(obj instanceof Employee){
			Employee emp=(Employee)obj;
			if(emp.ssn==this.ssn){
				flag=true;
			}
		}
		return flag;
	}
	
	@Override
	public int hashCode(){
		return this.id;
	}

}
