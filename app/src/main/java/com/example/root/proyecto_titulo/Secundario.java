package com.example.root.proyecto_titulo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by root on 28-09-16.
 */

public class Secundario extends AppCompatActivity {

    private Button btnBuscarAsignatura;
    private Button btnHorario;
    private Button btnNotas;
    private Button btnMochila;

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundario);

        btnBuscarAsignatura = (Button) findViewById(R.id.BuscarAsignatura);
        btnHorario = (Button) findViewById(R.id.Horario);
        btnNotas = (Button) findViewById(R.id.Notas);
        btnMochila = (Button) findViewById(R.id.Mochila);

        btnBuscarAsignatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent horario = new Intent(Secundario.this, BuscarHorario.class);
                Secundario.this.startActivity(horario);
            }
        });


    }

    /*
    * Visualizar el menu derecho
    * */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}


