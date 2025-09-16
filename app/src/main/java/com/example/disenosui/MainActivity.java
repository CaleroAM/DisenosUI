package com.example.disenosui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDiseno1 = findViewById(R.id.btnDiseno1);
        Button btnDiseno2 = findViewById(R.id.btnDiseno2);
        Button btnDiseno3 = findViewById(R.id.btnDiseno3);

        btnDiseno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Diseno1Activity.class);
                startActivity(intent);
            }
        });

        btnDiseno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Diseno2Activity.class);
                startActivity(intent);
            }
        });

        btnDiseno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Diseno3Activity.class);
                startActivity(intent);
            }
        });
    }
}