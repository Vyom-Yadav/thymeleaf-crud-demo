package com.luv2code.thymeleafcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.thymeleafcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it, no need of writing impl for basic methods, spring data JPA handles it.

    // add a method to sort by last name
    public List<Employee> findAllByOrderByFirstNameAsc();
}
