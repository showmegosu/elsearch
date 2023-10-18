package com.ogryn.elsearch.service;

import com.ogryn.elsearch.model.Employee;
import com.ogryn.elsearch.dto.EmployeesDTO;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees(EmployeesDTO request);
}
