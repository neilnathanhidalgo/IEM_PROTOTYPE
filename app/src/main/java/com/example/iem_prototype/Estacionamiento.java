package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Estacionamiento extends AppCompatActivity {

    TextView txt_back_est;
    TextView txt_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacionamiento);

        txt_back_est = findViewById(R.id.txt_back_est);
        txt_off = findViewById(R.id.txt_off);

        String origen = getIntent().getStringExtra("Origen");

        txt_back_est.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir = new Intent(Estacionamiento.this, Seleccionar_Op.class);

                salir.putExtra("Origen", origen);
                startActivity(salir);
                finish();
            }
        });
    }
}