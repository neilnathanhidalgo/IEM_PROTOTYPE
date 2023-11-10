package com.example.iem_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.ControlAction;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Iniciar_Sesion extends AppCompatActivity {

    TextView btn_login;
    TextView btn_back;
    TextView txt_email;
    TextView txt_contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        btn_login = findViewById(R.id.btn_login);
        btn_back = findViewById(R.id.btn_back);

        txt_email = findViewById(R.id.txt_email);
        txt_contra = findViewById(R.id.txt_contra);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txt_email.getText().toString();
                String contra = txt_contra.getText().toString();

                Intent seleccionarOp = new Intent(Iniciar_Sesion.this, Seleccionar_Op.class );

                seleccionarOp.putExtra("Origen", "Interno");

                if (!email.equals("nat") || !contra.equals("123")) {

                    Toast.makeText(getApplicationContext(), "Correo o contra incorrectos, vuelva a intentarlo", Toast.LENGTH_LONG).show();

                } else {
                    startActivity(seleccionarOp);
                    finish();
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volverMain = new Intent(Iniciar_Sesion.this, MainActivity.class );

                startActivity(volverMain);
                finish();
            }
        });

        String back = "Atrás";

        SpannableString spannableString = new SpannableString(back);
        spannableString.setSpan(new UnderlineSpan(), 0, back.length(), 0);

        btn_back.setText(spannableString);
    }
}