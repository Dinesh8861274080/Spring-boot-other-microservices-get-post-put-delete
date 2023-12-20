package com.example.Department;

import java.util.List;
import java.util.Optional;

public interface service {

	Employee AddMethod(Employee employee);
	List<Employee> getEmployees();
	Optional<Employee> getById(Integer id);
	void DeleteById(Integer id);
	Employee updatEmployee(Integer id, Employee employee);

}
