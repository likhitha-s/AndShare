package com.example.andshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class display extends AppCompatActivity {

    private Button Logout;
    private int login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Logout = findViewById(R.id.logout);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(display.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void setvalue() {
        SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
        SharedPreferences.Editor editor1 = settings1.edit();
        editor1.putInt("SNOW_DENSITY", 0);
        editor1.commit();

    }

        private void checkvalue () {
            SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
            login = settings1.getInt("SNOW_DENSITY1", 0);
        }
    }



