package com.example.disenosui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Diseno1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseno1);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}