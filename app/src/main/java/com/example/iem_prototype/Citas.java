package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class Citas extends AppCompatActivity {

    TextView txt_b2;
    TextView txt_d;
    TextView txt_h1;
    TextView txt_h2;
    TextView txt_h3;
    TextView txt_h4;
    TextView txt_h5;

    ImageView img_cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        txt_b2 = findViewById(R.id.txt_b2);
        txt_d = findViewById(R.id.txt_d);
        txt_h1 = findViewById(R.id.txt_h1);
        txt_h2 = findViewById(R.id.txt_h2);
        txt_h3 = findViewById(R.id.txt_h3);
        txt_h4 = findViewById(R.id.txt_h4);
        txt_h5 = findViewById(R.id.txt_h5);
        img_cal = findViewById(R.id.img_cal);

        txt_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(Citas.this, Seleccionar_Op.class);

                startActivity(volver);

                finish();
            }
        });

        String back = "Atrás";

        SpannableString spannableString = new SpannableString(back);
        spannableString.setSpan(new UnderlineSpan(), 0, back.length(), 0);

        txt_b2.setText(spannableString);


    }

    public void mostrarCalendario(View view) {
        final Calendar calendario = Calendar.getInstance();
        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        txt_d.setText(dayOfMonth + "/" + (monthOfYear + 1));
                    }
                },
                anio, mes, dia);

        datePickerDialog.show();

    }
}