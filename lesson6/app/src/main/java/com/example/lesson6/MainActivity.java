package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText loginText;
    EditText passwordText;

    Button loginButton;
    Button registerButton;

    String login="vika";
    String password="12345v";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginText=(EditText)findViewById(R.id.textEditLogin);
        passwordText=(EditText)findViewById(R.id.textEditPassword);

        loginButton=(Button) findViewById(R.id.buttonLogin);
        registerButton=(Button) findViewById(R.id.buttonRegister);

    }

    public void clickOnLogReg(View v){
        if(TextUtils.isEmpty(loginText.getText().toString())||TextUtils.isEmpty(passwordText.getText().toString())){
            loginText.setError("Incorrect input");
            passwordText.setError("Incorrect input");
        }else if(loginText.getText().toString().equals(login) && passwordText.getText().toString().equals(password)){
            Toast toast =Toast.makeText(getApplicationContext(),"Hi",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast =Toast.makeText(getApplicationContext(),"Incorrect input",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}