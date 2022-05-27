package com.example.lesson05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberOme;
    EditText numberTwo;

    TextView addResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOme=(EditText)findViewById(R.id.textEditFirstNum);
        numberTwo=(EditText)findViewById(R.id.textEditSecondNum);

        addResult=(TextView) findViewById(R.id.textViewResult);
    }


    public void addClick(View v){
        double num1=0;
        double num2=0;
        double result=0;

        if(TextUtils.isEmpty(numberOme.getText().toString())
                ||TextUtils.isEmpty(numberTwo.getText().toString())){
            return;
        }

        num1=Float.parseFloat(numberOme.getText().toString());
        num2=Float.parseFloat(numberTwo.getText().toString());

        result=num1+num2;

        addResult.setText(num1+" + "+num2+" = "+result);
    }
}