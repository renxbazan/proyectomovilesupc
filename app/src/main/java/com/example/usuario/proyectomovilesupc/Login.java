package com.example.usuario.proyectomovilesupc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Button boton= (Button) findViewById(R.id.btaceptar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText) findViewById(R.id.txtpassword)).getText().toString();
                if (usuario.equals("mruiz")&& password.equals("12345678"))
                {
                    Intent formprogramacion= new Intent(Login.this,Programacion.class);
                    startActivity(formprogramacion);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña no valida",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
