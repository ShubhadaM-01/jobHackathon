package com.example.jobhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        }
    public void login(View view)
    {
        Intent intentl=new Intent(this,homescreen.class);
        startActivity(intentl);
    }
    public void createAccount(View view)
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}