package com.example.dentalclinicmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {

    Button buttonReceptionist;
    Button buttonDental;
    Button buttonPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonReceptionist = findViewById(R.id.button_receptionist);
        buttonDental = findViewById(R.id.button_dentist_hygienist);
        buttonPatient = findViewById(R.id.button_patient);

        buttonReceptionist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReceptionistActivity.class);
                //intent.putExtra("role", "instructor");
                MainActivity.this.startActivity(intent);
            }
        });

        buttonDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, DentalActivity.class);
                //intent.putExtra("role", "member");
                MainActivity.this.startActivity(intent1);
            }
        });

        buttonPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, PatientActivity.class);
                MainActivity.this.startActivity(intent2);
            }
        });

    }
}