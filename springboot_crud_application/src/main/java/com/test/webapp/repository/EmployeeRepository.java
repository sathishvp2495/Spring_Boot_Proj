package com.test.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.webapp.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String>{}
