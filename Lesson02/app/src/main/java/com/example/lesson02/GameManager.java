package com.example.lesson02;

import java.util.List;

public class GameManager {
    Board board;
    List<Controller> controller;

    GameManager(Board board,List<Controller> controller,String className){
        this.board=board;
        this.controller=controller;

        android.util.Log.e("TAG", className);
    }

    void click(){}
}
