package com.example.lesson04;

import java.util.List;

public class Department {
    String nameDepartment;
    int priority;
    List<Person> personList;

    Department(String nameDepartment,int priority){
        this.nameDepartment=nameDepartment;
        this.priority=priority;
    }
}
