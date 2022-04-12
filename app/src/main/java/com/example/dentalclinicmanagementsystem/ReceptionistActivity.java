package com.example.dentalclinicmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.concurrent.ConcurrentHashMap;

public class ReceptionistActivity extends AppCompatActivity {
    Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptionist);

        buttonHome = findViewById(R.id.button_homeR);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReceptionistActivity.this, MainActivity.class);
                //intent.putExtra("role", "instructor");
                ReceptionistActivity.this.startActivity(intent);
            }
        });
    }
}
