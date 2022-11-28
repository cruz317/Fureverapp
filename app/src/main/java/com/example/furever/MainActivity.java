package com.example.furever;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton login = findViewById(R.id.login);

        login.setOnClickListener(v -> {
            if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
            {
                //correct
                Toast.makeText(MainActivity.this, "Login Sucessful",Toast.LENGTH_SHORT).show();
            }else
                Toast.makeText(MainActivity.this, "Login failed",Toast.LENGTH_SHORT).show();
        });
    }
}