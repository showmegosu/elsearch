package com.ogryn.elsearch.controller;

import com.ogryn.elsearch.dto.EmployeesDTO;
import com.ogryn.elsearch.model.Employee;
import com.ogryn.elsearch.model.Response;
import com.ogryn.elsearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Response getEmployees(@RequestBody EmployeesDTO request) {
        var result = employeeService.getEmployees(request);
        Response response = new Response();
        response.setCount(result.size());
        List<Employee> employees = result.stream().limit(10).toList();
        response.setResults(employees);
        return response;
    }
}
