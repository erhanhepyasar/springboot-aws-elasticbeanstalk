package com.example.elastic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elastic.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
