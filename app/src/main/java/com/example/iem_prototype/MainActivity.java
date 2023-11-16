package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_inicio;
    TextView btn_ext;
    TextView txt_qa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inicio =  findViewById(R.id.btn_inicio);
        btn_ext = findViewById(R.id.btn_ext);
        txt_qa = findViewById(R.id.txt_qa);

        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iniciarSesion = new Intent(MainActivity.this, Iniciar_Sesion.class);

                startActivity(iniciarSesion);
                finish();
            }
        });

        btn_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicioExterno = new Intent(MainActivity.this, Seleccionar_Op.class);

                inicioExterno.putExtra("Origen", "Externo");

                startActivity(inicioExterno);
                finish();
            }
        });

        String qa = "Preguntas Frecuentes";

        SpannableString spannableString = new SpannableString(qa);
        spannableString.setSpan(new UnderlineSpan(), 0, qa.length(), 0);

        txt_qa.setText(spannableString);
    }
}