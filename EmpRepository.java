package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.company.Employee;


@Repository
public class EmpRepository {
       

	public  ArrayList<Employee> employee=new ArrayList<Employee>();
       public  ArrayList<Employee> getAll() {
    	  return employee;
       }
	public String add(Employee emp) {
		employee.add(emp);
		return "successfully added";
	}
	public String edit(Employee emp) {
		employee.stream().filter(e->e.getEmpid()==emp.getEmpid()).forEach(e->{e.setAddress(emp.getAddress());
		                                                                                       e.setName(emp.getName());});
		return "successfully updated";
	}
	
	}

