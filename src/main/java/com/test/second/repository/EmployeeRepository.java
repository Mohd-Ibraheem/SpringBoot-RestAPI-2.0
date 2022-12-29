package com.test.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.second.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
