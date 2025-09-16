package com.example.disenosui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Diseno3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseno3);

        // Configurar título
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Diseño 3 - Calculadora");
        }
    }
}