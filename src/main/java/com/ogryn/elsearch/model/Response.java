package com.ogryn.elsearch.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response {
    private int count;
    private List<Employee> results;
}
