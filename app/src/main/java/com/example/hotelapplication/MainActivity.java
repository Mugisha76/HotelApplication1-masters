package com.example.hotelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText username;
     EditText password;
     Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Validate(View view) {

        username = findViewById(R.id.userName);
        password = findViewById(R.id.passWord);
        if (username.getText().toString().equals("Mugisha") && password.getText().toString().equals("lovedogz7")) {
            Intent intent = new Intent(this, navbar.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Second.class);
            startActivity(intent);
        }
    }


    }


