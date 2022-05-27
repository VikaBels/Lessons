package com.example.lesson02;

public class Figure {
    String name;

    Figure(String name,String className){
        super();
        this.name=name;
        android.util.Log.e("TAG", className);
    }

    public Figure() {}

    void getName(){};
}
