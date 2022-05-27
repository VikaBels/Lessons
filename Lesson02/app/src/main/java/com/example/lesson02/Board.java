package com.example.lesson02;

import com.example.lesson02.Cell;
import com.example.lesson02.Polygon;

import java.util.List;

public class Board {
    int height;
    int width;
    int numberLine;
    Cell[][] cell;
    List<Polygon> indexPolygon;

    Board(int height,int width,int numberLine,Cell[][] cell,List<Polygon> indexPolygon,String className){
        this.height=height;
        this.cell=cell;
        this.indexPolygon=indexPolygon;
        this.numberLine=numberLine;
        this.width=width;

        android.util.Log.e("TAG", className);
    }
    Board(){}

    void click(){}

    void addFigure(){}

    void removeFigure(){}

    void addCell(){}

    void removeCell(){}
}
