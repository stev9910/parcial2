package com.example.operaciones_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pantalla_principal extends AppCompatActivity {

    Button botonopcion;
    EditText usuario;
    EditText password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);
        usuario=findViewById(R.id.campo_usuario);
        password=findViewById(R.id.campo_password);
        botonopcion=findViewById(R.id.boton_op);
        botonopcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarpantalla();
            }
        });
    }
    public void cambiarpantalla(){
        int valoropci = Integer.parseInt(usuario.getText().toString());
        if(valoropci == 1) {


        }else if(valoropci == 2) {
            Intent pantubi = new Intent(this, Ubicacion_u.class);
            startActivity(pantubi);
        }else {
            Intent pant = new Intent(this, pantalla_principal.class);
            startActivity(pant);
        }
    }
}