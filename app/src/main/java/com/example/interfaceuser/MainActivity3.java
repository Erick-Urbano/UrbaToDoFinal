package com.example.interfaceuser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private EditText ct1;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ct1 = (EditText)findViewById(R.id.ct1);
        tv1 = (TextView) findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText(dato);

    }

    public void Enviar (View view) {

        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("dato", ct1.getText().toString());
        startActivity(i);

    }



}