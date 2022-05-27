package com.example.lesson02;

public class Cell {
    int type;

    Cell(int type,String className){
        this.type=type;
        android.util.Log.e("TAG", className);
    }

    void emptyOrNot(){}
}
