package com.example.jobhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,mobile,email;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void create(View view)
    {

        Intent intm=new Intent(this, login.class);
        startActivity(intm);
    }

    public void login(View view)
    {
        Intent intent2=new Intent(this, login.class);
        startActivity(intent2);
    }
}