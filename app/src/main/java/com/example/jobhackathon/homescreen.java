package com.example.jobhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }
    public void bookSlot(View view)
    {
        Intent intentb=new Intent(this,date_slot.class);
        startActivity(intentb);
    }

    public void bookingHistory(View view)
    {
        Intent intv=new Intent(this,booking_history.class);
        startActivity(intv);
    }
}