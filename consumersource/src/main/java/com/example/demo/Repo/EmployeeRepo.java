package com.example.demo.Repo;

import org.springframework.data.repository.Repository;

import com.example.demo.bean.Employee;

public interface EmployeeRepo extends Repository<Employee, String>{
	
	public Employee save(Employee s1);
}