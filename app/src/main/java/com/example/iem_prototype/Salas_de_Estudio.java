package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class Salas_de_Estudio extends AppCompatActivity {

    ImageView img_calendar;
    TextView txt_date;
    TextView txt_b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salas_de_estudio);

        img_calendar = findViewById(R.id.img_cal);

        txt_date = findViewById(R.id.txt_d);
        txt_b1 = findViewById(R.id.txt_b1);

        txt_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(Salas_de_Estudio.this, Seleccionar_Op.class);

                startActivity(volver);
                finish();
            }
        });

        String back = "Atrás";

        SpannableString spannableString = new SpannableString(back);
        spannableString.setSpan(new UnderlineSpan(), 0, back.length(), 0);

        txt_b1.setText(spannableString);
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
                        txt_date.setText(dayOfMonth + "/" + (monthOfYear + 1));
                    }
                },
                anio, mes, dia);

        datePickerDialog.show();

    }
}