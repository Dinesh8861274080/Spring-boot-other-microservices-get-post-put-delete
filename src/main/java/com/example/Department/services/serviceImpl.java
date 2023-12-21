package com.example.Department.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Department.Model.Employee;
import com.example.Department.Repository.Repository;

@Service
public class serviceImpl implements service {
	 
	@Autowired
	private Repository repository;
	
	@Override
	public Employee AddMethod(Employee employee) {
		return repository.save(employee);
	}
	@Override
	public List<Employee> getEmployees() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Employee> getById(Integer id) {
		return repository.findById(id);
	}
	@Override
	public void DeleteById(Integer id) {
         repository.deleteById(id);
	}
	
	@Override
	public Employee updatEmployee (Integer id, Employee employee) {
		Employee employee1 = new Employee();
		employee1.setId(employee.getId());
		employee1.setFirstName(employee.getFirstName());
		employee1.setLastName(employee.getLastName());
		employee1.setEmailId(employee.getEmailId());
		employee1.setDepartmentId(employee.getDepartmentId());
		return repository.save(employee1);
		
	}

}
