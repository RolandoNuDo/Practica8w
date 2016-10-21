package com.rolando.practica8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txtResultado;
    EditText metros, pies;
    Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        metros = (EditText) findViewById(R.id.editText);
        pies = (EditText) findViewById(R.id.editText2);
        calcular = (Button) findViewById(R.id.button);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                double metro = Double.parseDouble(metros.getText().toString().trim());
                double pie = Double.parseDouble(pies.getText().toString().trim());
                double suma = metro + (pie * .3048d);
                double sumaPul = suma/.0254;
                double sumaYar = suma*1.09361;
                double sumaMill = suma/1609;
                txtResultado.setText("Metros= "+suma+"\nPulgadas= "+sumaPul+"\nYardas= "+sumaYar+"\nMillas= "+sumaMill);
                txtResultado.setVisibility(View.VISIBLE);
        }
    }
}
