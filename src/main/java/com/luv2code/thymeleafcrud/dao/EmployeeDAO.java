package com.luv2code.thymeleafcrud.dao;


import java.util.List;

import com.luv2code.thymeleafcrud.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
