package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ruff.springbootpostgresql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
