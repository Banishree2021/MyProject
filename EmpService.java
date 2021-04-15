package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.company.Employee;
import com.example.demo.repository.EmpRepository;
import com.example.demo.repository.EmployeeRepository;

 @Service
public class EmpService {
  @Autowired
  EmpRepository empRepository;
  
  @Autowired
  EmployeeRepository employeeRepositoryObj;
 // public ArrayList<Employee> getAll(){
  public List<Employee> getAll(){

       // return empRepository.getAll();
	  return  employeeRepositoryObj.findAll();
	  }
  
public String add(Employee emp) {
	//return empRepository.add(emp);
	 employeeRepositoryObj.save(emp);
	 return "Save success...";

}

public String edit(Employee emp) {
	//return empRepository.edit(emp);
	//Employee empObj=employeeRepositoryObj.findById(emp.getEmpid());
	employeeRepositoryObj.saveAndFlush(emp);
	return "Update success";
}

}
