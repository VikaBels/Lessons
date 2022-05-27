package com.example.lesson02;

public class Position {
    int x;
    int y;

    Position(int x,int y,String className){
        this.x=x;
        this.y=y;

        android.util.Log.e("TAG", className);
    }

    Position(int x,int y){
        this.x=x;
        this.y=y;
    }
}
