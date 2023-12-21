package com.example.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Department.Model.Employee;

public interface Repository extends JpaRepository<Employee, Integer> {

}
