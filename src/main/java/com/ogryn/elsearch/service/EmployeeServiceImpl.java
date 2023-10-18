package com.ogryn.elsearch.service;

import com.ogryn.elsearch.model.Employee;
import com.ogryn.elsearch.repository.EmployeeRepository;
import com.ogryn.elsearch.dto.EmployeesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getEmployees(EmployeesDTO request) {
        return repository.findByInterestAndMinSalary(request.getInterest(), request.getMinSalary());
    }
}
