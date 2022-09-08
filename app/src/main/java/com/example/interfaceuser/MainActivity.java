package com.example.interfaceuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_usuario);
        et2=(EditText)findViewById(R.id.txt_password);
    }

    public void ingresar(View view){

        String nombre_usuario=et1.getText().toString();
        String password_usuario=et2.getText().toString();
        String password="Erick";
        if (password.equals(password_usuario)){
            Toast.makeText(this,  "usuario"+nombre_usuario+"Bienvenido a la aplicación", Toast.LENGTH_SHORT).show();
        }   else {
            Toast.makeText(this, nombre_usuario + "Credenciales incorrectas", Toast.LENGTH_LONG).show();
        }

    }
}