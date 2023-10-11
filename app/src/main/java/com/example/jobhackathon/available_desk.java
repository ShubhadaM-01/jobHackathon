package com.example.jobhackathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class available_desk extends AppCompatActivity {
    TextView selecteddate;
    Button balert;
    AlertDialog.Builder alert=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_desk);


        String date1= getIntent().getStringExtra("selectdate");

        selecteddate = findViewById(R.id.textView17);
        selecteddate.setText(date1);
        balert=findViewById(R.id.button6);

        balert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert=new AlertDialog.Builder(available_desk.this);
                alert.setTitle("Confirm Booking");
                

                alert.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(available_desk.this, "Successfully done booking", Toast.LENGTH_LONG).show();


                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(available_desk.this, "Cancel", Toast.LENGTH_LONG).show();
                    }
                });
                alert.show();
            }
        });
    }

    public void goBack(View view)
    {
        Intent intg=new Intent(this, date_slot.class);
        startActivity(intg);
    }
}