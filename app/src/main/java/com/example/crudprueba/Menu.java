package com.example.crudprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void abrirAlumno(View v){
        Intent i = new Intent(this, AlumnoCrud.class);
        startActivity(i);
    }

    public void abrirIngresoNotas(View v){
        Intent i = new Intent(this, IngresoNota.class);
        startActivity(i);
    }

    public void abrirConsultas(View v){
        Intent i = new Intent(this, Consultas.class);
        startActivity(i);
    }
}