package com.example.pelu.presupuesto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Pelu on 10/02/2017.
 */

public class Mantenimiento extends AppCompatActivity {

    private Button Boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.mantenimiento);

        Boton = (Button) findViewById(R.id.button2);

        Boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Mantenimiento.this, Tarifas.class);
                startActivity(intent);
                finish();



            }



    });

    }



}
