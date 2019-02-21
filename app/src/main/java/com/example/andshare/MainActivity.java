package com.example.andshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Login;
    private EditText Username;
    private EditText Password;
    private int login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Login = findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login(Username.getText().toString(), Password.getText().toString());
            }
            });



    }
    private void setvalue() {
        SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
        SharedPreferences.Editor editor1 = settings1.edit();
        editor1.putInt("SNOW_DENSITY", 1);
        editor1.commit();
    }
        private void checkvalue () {
            SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
            login = settings1.getInt("SNOW_DENSITY1", 1);

        }

    public void Login(String Username, String Password) {
        if ((Username.equals("Admin") && Password.equals("1234"))){

            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Invalid User", Toast.LENGTH_SHORT).show();

        }
    }

}

