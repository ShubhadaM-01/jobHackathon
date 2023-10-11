package com.example.jobhackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class date_slot extends AppCompatActivity {

    Calendar calendar;
    String selected_date;
    CalendarView calendarView;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_slot);


          calendar = Calendar.getInstance();
          calendarView = findViewById(R.id.calendarView);

          getDate();
          calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
              @Override
              public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int day) {
                   month=month+1;

                  Toast.makeText(date_slot.this, day+"/"+ month  +"/"+year, Toast.LENGTH_LONG).show();
              }
          });




    }


    public void getDate(){
          long date = calendarView.getDate();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yy", Locale.getDefault());
        calendar.setTimeInMillis(date);
        selected_date= simpleDateFormat.format(calendar.getTime());

    }

    public void availabel(View view)
    {
        Intent inta=new Intent(this, available_desk.class);
        Bundle extras=new Bundle();
        extras.putString("selectdate",selected_date);
        startActivity(inta);

    }

    public void goBack(View view)
    {
        Intent intg=new Intent(this, homescreen.class);
        startActivity(intg);
    }
}