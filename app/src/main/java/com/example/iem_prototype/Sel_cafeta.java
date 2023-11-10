package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Sel_cafeta extends AppCompatActivity {
    ImageView img_c_back;
    ImageView img_c1;
    ImageView img_c2;
    ImageView img_c3;
    ImageView img_c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sel_cafeta);

        img_c_back = findViewById(R.id.img_c_back);
        img_c1 = findViewById(R.id.img_c1);
        img_c2 = findViewById(R.id.img_c2);
        img_c3 = findViewById(R.id.img_c3);
        img_c4 = findViewById(R.id.img_c4);

        String origen = getIntent().getStringExtra("Origen");

        img_c_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir = new Intent(Sel_cafeta.this, Seleccionar_Op.class);

                salir.putExtra("Origen", origen);
                startActivity(salir);
                finish();
            }
        });
    }

    public void selection(View view) {
        String cafeta = view.getTag().toString();

        Intent caf = new Intent(Sel_cafeta.this, Menu_Cafeta.class);

        caf.putExtra("cafeta", cafeta);
        startActivity(caf);

    }
}