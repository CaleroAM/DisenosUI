package com.example.disenosui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Diseno2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseno2);

        // Configurar título
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Diseño 2 - Teclado");
        }
    }
}