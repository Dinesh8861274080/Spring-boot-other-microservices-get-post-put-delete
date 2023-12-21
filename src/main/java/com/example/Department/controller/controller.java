package com.example.Department.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Department.Model.Employee;
import com.example.Department.services.service;

@RestController
@RequestMapping("api")
public class controller {
	
	@Autowired
	private service service;
	
	@PostMapping("add")
	public Employee Add(@RequestBody Employee employee) {
		return service.AddMethod(employee);
	}
	@GetMapping("get")
	public List<Employee> get() {
		return service.getEmployees();
	}
	
	@GetMapping("get/{id}")
	public Optional<Employee> getByid(@PathVariable Integer id) {
		return service.getById(id);
	}
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable(value = "id") Integer id) {
		try {
			service.DeleteById(id);
			return "deleted success " +(id) ;
		}catch (Exception e) {
			// TODO: handle exception
		} {
			return "item not exist";
		}

	}
	
	@PutMapping("update")
	public Employee updateEmployee1(@RequestBody Employee employee, Integer id) {
		return service.updatEmployee(id, employee);
	}

}
