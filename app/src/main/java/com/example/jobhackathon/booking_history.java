package com.example.jobhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class booking_history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);
    }

    public void goBack(View view)
    {
        Intent intg=new Intent(this, available_desk.class);
        startActivity(intg);
    }
}