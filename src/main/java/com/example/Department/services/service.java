package com.example.Department.services;

import java.util.List;
import java.util.Optional;

import com.example.Department.Model.Employee;

public interface service {

	Employee AddMethod(Employee employee);
	List<Employee> getEmployees();
	Optional<Employee> getById(Integer id);
	void DeleteById(Integer id);
	Employee updatEmployee(Integer id, Employee employee);

}
