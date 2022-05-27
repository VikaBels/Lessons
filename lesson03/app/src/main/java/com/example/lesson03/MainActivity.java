package com.example.lesson03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    void FizzBuzz(){
        String fizzBuzz="";

        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0){
                fizzBuzz="Fizz Buzz";
            }
            else if(i%3==0){
                fizzBuzz="Fizz";
            }
            else if(i%5==0){
                fizzBuzz="Buzz";
            }
            else {
                fizzBuzz=Integer.toString(i);
            }
            System.out.println(fizzBuzz);
        }
    }

    void FizzBuzzWoof(){
        String fizzBuzzWoof="";

        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0 && i%7==0  ){
                fizzBuzzWoof="Fizz Buzz Woof";
            }
            else if(i%5==0 && i%7==0){
                fizzBuzzWoof="Buzz Woof";
            }
            else if(i%7==0 && i%3==0){
                fizzBuzzWoof="Fizz Woof";
            }
            else if(i%7==0){
                fizzBuzzWoof="Woof";
            }
            else {
                fizzBuzzWoof=Integer.toString(i);
            }
            System.out.println(fizzBuzzWoof);
        }
    }

    void multiplesOfThreeAndFive(){
        int sum=0;

        for(int i=0;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    Integer[] merge(Integer[] listOne,Integer[] listTwo){
       int lenght = listOne.length+listTwo.length;
        Integer[] res = new Integer[lenght];

        //List<Integer> intListOne = new ArrayList<>(Arrays.asList(listOne));
        //List<Integer> intListTwo = new ArrayList<>(Arrays.asList(listTwo));
        for(int i=0;i<res.length;i++){
            Integer[] numberOneInfo=getMin(listOne);
            Integer[] numberTwoInfo=getMin(listTwo);

            if(numberOneInfo[0]==0){
                res[i]=numberTwoInfo[0];
                listTwo[numberTwoInfo[1]]=0;
                continue;
            }
            else if(numberTwoInfo[0]==0) {
                res[i]=numberOneInfo[0];
                listOne[numberOneInfo[1]]=0;
                continue;
            }

            if(numberOneInfo[0]<numberTwoInfo[0]){
                res[i]=numberOneInfo[0];
                listOne[numberOneInfo[1]]=0;
            }
            else if(numberOneInfo[0]>numberTwoInfo[0]){
                res[i]=numberTwoInfo[0];
                listTwo[numberTwoInfo[1]]=0;
            }
            else {
                res[i]=numberOneInfo[0];
                listOne[numberOneInfo[1]]=0;
            }
        }
        return res;
    }

    public static Integer[] getMin(Integer[] inputArray) {
       Integer[] keyNumber=new Integer[2];
        int minValue = inputArray[0];
        int index=0;

        for (int i = 1; i < inputArray.length; i++) {
            if(minValue==0){
                minValue=inputArray[i];
                index=i;
            }
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
                index=i;
            }
        }
        keyNumber[0]=minValue;
        keyNumber[1]=index;

        return keyNumber;
    }


        void sortedMerge(){
        Integer[] list1 = new Integer[] { 2, 3, 4, 7, 11 };
        Integer[] list2 = new Integer[] { 2, 4, 6, 8, 10, 12, 14 };
        Integer[] result = merge(list1, list2);

        for (Integer val : result) {
            System.out.println(val);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FizzBuzz();
        //FizzBuzzWoof();
        //multiplesOfThreeAndFive();
        sortedMerge();
    }
}