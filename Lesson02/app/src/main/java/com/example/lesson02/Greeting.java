package com.example.lesson02;

public class Greeting {
    public String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        android.util.Log.e("TAG", greeting);
    }
}
