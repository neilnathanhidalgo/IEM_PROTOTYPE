package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Seleccionar_Op extends AppCompatActivity {

    LinearLayout ly1;
    LinearLayout ly2;
    LinearLayout ly_com;
    ImageView img_est;
    ImageView img_caf;
    ImageView img_ex;
    ImageView img_cita;
    ImageView img_study;
    ImageView img_place;
    ImageView img_bib;
    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_op);

        ly1 = findViewById(R.id.ly1);
        ly2 = findViewById(R.id.ly2);
        ly_com = findViewById(R.id.ly_com);

        img_est = findViewById(R.id.img_est);
        img_caf = findViewById(R.id.img_caf);
        img_ex = findViewById(R.id.img_c1);
        img_cita = findViewById(R.id.img_c2);
        img_study = findViewById(R.id.img_c3);
        img_place = findViewById(R.id.img_c4);
        img_bib = findViewById(R.id.img_bib);
        img_back = findViewById(R.id.img_c_back);


        String origen = getIntent().getStringExtra("Origen");

        if ("Externo".equals(origen)) {
            ly1.setVisibility(View.GONE);
            ly2.setVisibility(View.GONE);
            ly_com.setVisibility(View.GONE);
        }

        img_est.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent estacionamiento = new Intent(Seleccionar_Op.this, Estacionamiento.class);

                estacionamiento.putExtra("Origen", origen);
                startActivity(estacionamiento);
                finish();
            }
        });
        img_caf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cafeta = new Intent(Seleccionar_Op.this, Sel_cafeta.class);

                cafeta.putExtra("Origen", origen);
                startActivity(cafeta);
                finish();
            }
        });img_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Evaluaciones = new Intent(Seleccionar_Op.this, Evaluaciones.class);

                startActivity(Evaluaciones);
                finish();
            }
        });
        img_cita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent citas = new Intent(Seleccionar_Op.this, Citas.class);

                startActivity(citas);
                finish();
            }
        });
        img_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salas = new Intent(Seleccionar_Op.this, Salas_de_Estudio.class);

                startActivity(salas);
                finish();
            }
        });
        img_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent places = new Intent(Seleccionar_Op.this, Espacios_Universitarios.class);

                startActivity(places);
                finish();
            }
        });
        img_bib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bib = new Intent(Seleccionar_Op.this, Biblioteca.class);

                startActivity(bib);
                finish();
            }
        });
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir = new Intent(Seleccionar_Op.this, MainActivity.class);

                startActivity(salir);
                finish();
            }
        });


    }
}