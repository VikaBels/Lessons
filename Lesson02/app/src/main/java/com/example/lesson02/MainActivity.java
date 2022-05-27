package com.example.lesson02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    void numberOne(){
        Greeting greeting = new Greeting("Hello World");
        greeting.sayHello();
    }

    void numberTwo(){
        Cell[][] cellForBoard=new Cell[][]{};
        List<Polygon> polygons=new ArrayList<Polygon>();
        List<Position> positionP=new ArrayList<Position>();
        Board boardGM=new Board();
        List<Controller> controllers=new ArrayList<Controller>();

        Unit unit= new Unit("Unit");

        Figure figure=new Figure("square","Figure");

        Board board=new Board(4,4,5,cellForBoard,polygons,"Board");

        Cell cell=new Cell(1,"Cell");

        Polygon polygon=new Polygon(2,2,positionP,2,"Polygon");

        GameManager gameManager=new GameManager(boardGM,controllers,"GameManager");

        Position position =new Position(0,0,"Position");

        Controller controller=new Controller("Controller");

        Menu menu=new Menu("Menu");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //numberOne();
        numberTwo();

    }
}