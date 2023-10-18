package com.ogryn.elsearch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Getter
@Setter
@Document(indexName = "employees")
public class Employee {
    @Id
    @JsonIgnore
    private String id;
    @Field(type = FieldType.Text, name = "firstName")
    private String firstName;

    @Field(type = FieldType.Text, name = "firstName")
    private String lastName;

    @Field(type = FieldType.Keyword, name = "designation")
    private String designation;

    @Field(type = FieldType.Integer, name = "salary")
    private int salary;

    @Field(type = FieldType.Date, name = "dateOfJoining")
    private String dateOfJoining;

    @Field(type = FieldType.Keyword, name = "address")
    private String address;

    @Field(type = FieldType.Keyword, name = "gender")
    private String gender;

    @Field(type = FieldType.Integer, name = "age")
    private int age;

    @Field(type = FieldType.Keyword, name = "maritalStatus")
    private String maritalStatus;

    @Field(type = FieldType.Keyword, name = "interests")
    private List<String> interests;

}
