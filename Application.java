package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.repository.EmpRepository;


@SpringBootApplication
public class Application  {
    @Autowired
   EmpRepository empRepository;
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}
	/*
	 * @Override public void run(String... args)throws Exception{
	 * 
	 * Employee e1=new Employee(1,"BatMan","BatCave"); Employee e2=new
	 * Employee(2,"SuperMan","SuperCave");
	 * 
	 * //EmpRepository.employee.addAll(Arrays.asList(e1,e2));
	 * empRepository.employee.addAll(Arrays.asList(e1,e2));
	 * 
	 * 
	 * }
	 */
}
