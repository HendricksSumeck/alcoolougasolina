package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){

        TextView alcool = findViewById(R.id.alcool);
        TextView gasolina = findViewById(R.id.gasolina);

        TextView resultado = findViewById(R.id.exibir);;

        double valorAlcool = Double.parseDouble(alcool.getText().toString());
        double valorGasolina = Double.parseDouble(gasolina.getText().toString());

        double valor = valorAlcool / valorGasolina;

        if(valor <= 0.7){
            resultado.setText("Álcool");
        }
        else{
            resultado.setText("Gasolina");
        }




    }
}