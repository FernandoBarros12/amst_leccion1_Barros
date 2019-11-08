package com.example.amst_l1_barros_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Sidweb = (Button) findViewById(R.id.BtnSidweb);
        Sidweb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Sidweb.class);
                startActivityForResult(intent, 0);
            }
        });


        Button Academico = (Button) findViewById(R.id.BtnAcademico);
        Sidweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent (v1.getContext(), Academico.class);
                startActivityForResult(intent, 0);
            }
        });

        Button Vinculos = (Button) findViewById(R.id.BtnVinculos);
        Sidweb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                Intent intent = new Intent (v2.getContext(), Vinculos.class);
                startActivityForResult(intent, 0);
            }
        });

        Button Bienestar = (Button) findViewById(R.id.BtnBienestar);
        Sidweb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v3) {
                Intent intent = new Intent (v3.getContext(), Bienestar.class);
                startActivityForResult(intent, 0);
            }
        });


        }





}
