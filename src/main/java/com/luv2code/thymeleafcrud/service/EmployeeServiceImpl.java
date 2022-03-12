package com.luv2code.thymeleafcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.luv2code.thymeleafcrud.dao.EmployeeRepository;
import com.luv2code.thymeleafcrud.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(
            EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override // No need to @Transactional since
    // Spring DATA JPA already provides it
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByFirstNameAsc();
    }

    @Override
    public Employee findById(int id) {
        // if null exception will be thrown
        return employeeRepository.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    // When we used EmployeeDAO and its implementation.
    /*private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(@Qualifier("employeeDaoJpaImpl") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }*/
}
