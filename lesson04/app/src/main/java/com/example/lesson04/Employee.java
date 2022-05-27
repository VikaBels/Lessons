package com.example.lesson04;

public class Employee extends Person{
    Department department;
    //Role role;

    Employee(Department department,String name,String surname,String patronymic,int age,int wage){
        super(new FullName(name,surname,patronymic),age,wage);
        this.department=department;
        //this.role=role;
    }

}
