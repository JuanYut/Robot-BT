package com.juan.interfazrobotibt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivityJava extends AppCompatActivity {

    public RadioButton rbAzul, rbNegro, rbAmarillo, rbRojo;
    public TextView tvDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbAzul = findViewById(R.id.rbAzul);
        rbNegro = findViewById(R.id.rbNegro);
        rbAmarillo = findViewById(R.id.rbAmarillo);
        rbRojo = findViewById(R.id.rbRojo);

        // TextView "Dato:"
        tvDato = findViewById(R.id.tvDato);

        // Instancia y declaracion de los botones.
        Button btnPos1 = findViewById(R.id.btnPos1);
        Button btnPos2 = findViewById(R.id.btnPos2);
        Button btnPos3 = findViewById(R.id.btnPos3);
        Button btnParar = findViewById(R.id.btnParar);
        Button btnDesconectar = findViewById(R.id.btnDesconectar);

        // Funcion de los botones.
        btnPos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo.

                // Simple ejemplo para comprobar la funcion y que el boton funcione:
                tvDato.setText(saberColor());
            }
        });

        btnPos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo.
            }
        });

        btnPos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo.
            }
        });

        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo.
            }
        });

        btnDesconectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo.
            }
        });

        // Instancia y declaracion de las imagenes.
        ImageView ivAzul = findViewById(R.id.ivAzul);
        ImageView ivNegro = findViewById(R.id.ivNegro);
        ImageView ivAmarillo = findViewById(R.id.ivAmarillo);
        ImageView ivRojo = findViewById(R.id.ivRojo);

        // Función para que al tocar una imagen se marque el radiobutton.
        ivAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbAzul.setChecked(true);
            }
        });
        ivNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbNegro.setChecked(true);
            }
        });
        ivAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbAmarillo.setChecked(true);
            }
        });
        ivRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbRojo.setChecked(true);
            }
        });

    }

    // Función para saber que color esta seleccionado.
    public String saberColor() {
        if (rbAzul.isChecked()==true) {
            return "azul";
        } else if (rbNegro.isChecked()==true) {
            return "negro";
        } else if (rbAmarillo.isChecked()==true) {
            return "amarillo";
        } else {
            return "rojo";
        }
    }

}
