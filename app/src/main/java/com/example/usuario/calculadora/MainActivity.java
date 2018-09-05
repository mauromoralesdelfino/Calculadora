package com.example.usuario.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener escuchador = new MyListener(this);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnMas = (Button) findViewById(R.id.btnMas);
        Button btnMenos = (Button) findViewById(R.id.btnMen);
        Button btnPor = (Button) findViewById(R.id.btnPor);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnDEL = (Button) findViewById(R.id.btnBorra);
        Button btnComa = (Button) findViewById(R.id.btnComa);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);


        btn1.setOnClickListener(escuchador);
        btn2.setOnClickListener(escuchador);
        btn3.setOnClickListener(escuchador);
        btn4.setOnClickListener(escuchador);
        btn5.setOnClickListener(escuchador);
        btn6.setOnClickListener(escuchador);
        btn7.setOnClickListener(escuchador);
        btn8.setOnClickListener(escuchador);
        btn9.setOnClickListener(escuchador);
        btn0.setOnClickListener(escuchador);
        btnMas.setOnClickListener(escuchador);
        btnMenos.setOnClickListener(escuchador);
        btnPor.setOnClickListener(escuchador);
        btnDiv.setOnClickListener(escuchador);
        btnDEL.setOnClickListener(escuchador);
        btnComa.setOnClickListener(escuchador);
        btnIgual.setOnClickListener(escuchador);


    }
}
