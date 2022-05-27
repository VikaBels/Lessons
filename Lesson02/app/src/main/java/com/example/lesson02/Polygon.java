package com.example.lesson02;

import java.util.List;

public class Polygon extends Figure{
    int height;
    int width;
    List<Position> position;
    int index;

    Polygon(int height,int width,List<Position> position,int index,String className){
        super();
        this.height=height;
        this.width=width;
        this.position=position;
        this.index=index;

        android.util.Log.e("TAG", className);
    }

    public Polygon() {}

    void changeWidth(){}

    void changeHeight(){}
}
