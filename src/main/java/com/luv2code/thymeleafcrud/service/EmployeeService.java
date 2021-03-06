package com.luv2code.thymeleafcrud.service;


import java.util.List;

import com.luv2code.thymeleafcrud.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);



}
