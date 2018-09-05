package com.example.opet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;

public class Exerc01_LuisHoinski extends AppCompatActivity {


    private Button btnCalcularButton;
    private Button btnLimpar;
    private EditText editTextValorLimite;
    private EditText editTextNovoValor;
    private EditText editTextSaldoAtual;
    public double saldoAtual = 0, aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerc01__luis_hoinski);

        btnCalcularButton = (Button)findViewById(R.id.btnLimpar);
        btnLimpar  = (Button)findViewById(R.id.btnLimpar);
        editTextNovoValor = findViewById(R.id.editTextNovoValor);
        editTextValorLimite = findViewById(R.id.editTextValorLimite);
        editTextSaldoAtual = findViewById(R.id.editTextSaldoAtual);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNovoValor.setText("");
                editTextValorLimite.setText("Digite o valor Limite");
            }
        });
    }

    public void calcular(View view){
        double novoValor, saldoAtual, valorLimite;

        valorLimite = Double.parseDouble(editTextValorLimite.getText().toString());
        saldoAtual  = valorLimite;
        novoValor = Double.parseDouble(editTextNovoValor.getText().toString());
        //saldoAtual = Double.parseDouble(editTextSaldoAtual.getText().toString());


        if ( novoValor > valorLimite){
           editTextNovoValor.setText("Excedeu o valor de limite");

        }else{

            saldoAtual = aux - novoValor;
            editTextSaldoAtual.setText(String.valueOf(saldoAtual));

             editTextNovoValor.setText("");
        }




    }
}
