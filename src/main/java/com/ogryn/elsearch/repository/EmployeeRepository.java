package com.ogryn.elsearch.repository;

import com.ogryn.elsearch.model.Employee;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, Integer> {
    @Query("{\"bool\": {\"must\": [{\"match\": {\"interests\": \"?0\"}}, {\"range\": {\"salary\": {\"gte\": ?1}}}]}}")
    List<Employee> findByInterestAndMinSalary(String interest, int minSalary);
}
