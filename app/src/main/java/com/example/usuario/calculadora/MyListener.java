package com.example.usuario.calculadora;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import  android.widget.Toast;
import java.lang.*;


public class MyListener implements View.OnClickListener
{
    private View _text;
    private View _editT;
    private View _btn;
    private MainActivity _miAct;



    private Double resultado;
    //

    @Override
    public void onClick(View v)
    {   int color;
        EditText et = (EditText) _miAct.findViewById(R.id.eText1);
        TextView t = (TextView) _miAct.findViewById(R.id.txt1);
        String s = "";


        switch (v.getId()) {

            case R.id.btn1:

                s=t.getText().toString();
                t.setText(s+"1");
                ActivarOperaciones();
                break;

            case R.id.btn2:

                s=t.getText().toString();
                t.setText(s+"2");
                ActivarOperaciones();
                break;

            case R.id.btn3:

                s=t.getText().toString();
                t.setText(s+"3");
                ActivarOperaciones();
                break;

            case R.id.btn4:

                s=t.getText().toString();
                t.setText(s+"4");
                ActivarOperaciones();
                break;

            case R.id.btn5:

                s=t.getText().toString();
                t.setText(s+"5");
                ActivarOperaciones();
                break;

            case R.id.btn6:

                s=t.getText().toString();
                t.setText(s+"6");
                ActivarOperaciones();
                break;

            case R.id.btn7:

                s=t.getText().toString();
                t.setText(s+"7");
                ActivarOperaciones();
                break;

            case R.id.btn8:

                s=t.getText().toString();
                t.setText(s+"8");
                ActivarOperaciones();
                break;

            case R.id.btn9:

                s=t.getText().toString();
                t.setText(s+"9");
                ActivarOperaciones();
                break;

            case R.id.btn0:

                s=t.getText().toString();
                t.setText(s+"0");
                ActivarOperaciones();
                //v.findViewById(R.id.btnMas).setClickable(true);


                break;

            case R.id.btnMas:

                s = t.getText().toString();
                t.setText(s+" "+"+"+" ");
                GrisearOperaciones();

                /*v.setClickable(false);
                color = Color.parseColor("#F44336");
                v.setBackgroundColor(color);*/
                break;

            case R.id.btnMen:
                s = t.getText().toString();
                t.setText(s+" "+"-"+" ");
                GrisearOperaciones();
                break;

            case R.id.btnPor:
                s = t.getText().toString();
                t.setText(s+" "+"x"+" ");
                GrisearOperaciones();
                break;

            case R.id.btnDiv:
                s = t.getText().toString();
                t.setText(s+" "+"/"+" ");
                GrisearOperaciones();
                break;

            case R.id.btnBorra:
                s = t.getText().toString();
                if (s.length()>=1)
                {s = s.substring(0, s.length()-1);
                    t.setText(s);
                }

                break;

            case R.id.btnComa:
                s = t.getText().toString();
                t.setText(s+",");
                GrisearOperaciones();
                break;

            case R.id.btnIgual:
                // do your code
                ActivarOperaciones();
                s = t.getText().toString();
               // Integer a = s.length();
             //   Integer.toString(a);
                if(VerificacionSimbolo(s) && VerificacionSegundoNumero(s))
                {
                   // ActivarOperaciones();
                    Calculos c = new Calculos();
                    String[] numeros = c.ObtenerNumeros(s);
                    this.setResultado(c.Calcular(numeros));
                    String j = resultado.toString();
                    t.setText(j);

                }
                else
                {
                    //Toast toast1 = Toast.makeText(_miAct.getApplicationContext(), a.toString(), Toast.LENGTH_SHORT);
                    Toast toast1 = Toast.makeText(_miAct.getApplicationContext(), "Verifique Operacion Ingresada", Toast.LENGTH_SHORT);
                    toast1.show();
                   // GrisearOperaciones();

                }


                break;

            default:
                break;
        }

    }

    public void GrisearOperaciones()
    {
        Button btnMas = (Button) _miAct.findViewById(R.id.btnMas);
        Button btnMenos = (Button) _miAct.findViewById(R.id.btnMen);
        Button btnPor = (Button) _miAct.findViewById(R.id.btnPor);
        Button btnDiv = (Button) _miAct.findViewById(R.id.btnDiv);
        //Button btnDEL = (Button) _miAct.findViewById(R.id.btnBorra);
        Button btnComa = (Button) _miAct.findViewById(R.id.btnComa);

        btnMas.setClickable(false);
        btnMenos.setClickable(false);
        btnPor.setClickable(false);
        btnDiv.setClickable(false);
        //btnDEL.setClickable(false);
        btnComa.setClickable(false);
    }
    public void ActivarOperaciones()
    {
        Button btnMas = (Button) _miAct.findViewById(R.id.btnMas);
        Button btnMenos = (Button) _miAct.findViewById(R.id.btnMen);
        Button btnPor = (Button) _miAct.findViewById(R.id.btnPor);
        Button btnDiv = (Button) _miAct.findViewById(R.id.btnDiv);
        Button btnDEL = (Button) _miAct.findViewById(R.id.btnBorra);
        Button btnComa = (Button) _miAct.findViewById(R.id.btnComa);

        btnMas.setClickable(true);
        btnMenos.setClickable(true);
        btnPor.setClickable(true);
        btnDiv.setClickable(true);
        btnDEL.setClickable(true);
        btnComa.setClickable(true);
    }

    public boolean VerificacionSimbolo(String s)
    {
        boolean resp = false;
        String operaciones = "+-*/";
        for (Integer i=0;i<operaciones.length();i++)
        {
            operaciones.eq
            //if(s.equals(operaciones.charAt(i)))
            if(s.equals(Character.toString((operaciones.charAt(i)))))
            {
                return resp;
            }


        }

        return resp;
    }

    public boolean VerificacionSegundoNumero(String s)
    {
        boolean resp = false;
        String nums="0123456789";
        //Char ultimo=(s.charAt(s.length()-1));
        String ultimo = Character.toString((s.charAt(s.length()-1)));
        //System.out.println(s.charAt(s.length()-1));
        for (Integer i=0;i<nums.length();i++)
        {

           // if(ultimo.equals(nums.charAt(i)))
            if(ultimo.equals(Character.toString((nums.charAt(i)))))
            {

                return resp;
            }

        }
        return resp;
    }

    public MyListener( MainActivity act)
    {
        this._miAct = act;
    }

    public View get_btn() {
        return _btn;
    }

    public View get_text() {
        return _text;
    }

    public View get_editT() {
        return _editT;
    }

    public void set_text(View _text) {
        this._text = _text;
    }

    public void set_editT(View _editT) {
        this._editT = _editT;
    }

    public void set_btn(View _btn) {
        this._btn = _btn;
    }

    public MainActivity get_miAct() {
        return _miAct;
    }

    public void set_miAct(MainActivity _miAct) {
        this._miAct = _miAct;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
