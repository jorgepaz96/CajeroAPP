package com.example.cajeroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clave = (EditText) findViewById(R.id.clave);
    }

    public void ingresar(View view) {
        if (clave.getText().toString().equals("4440")){
            Intent i=new Intent(this, opciones.class);
            i.putExtra("saldo","1000");
            startActivity(i);
        }else {
            Toast.makeText(getApplicationContext(),"Ingresar usuario valido",Toast.LENGTH_SHORT).show();
        }
    }
}
