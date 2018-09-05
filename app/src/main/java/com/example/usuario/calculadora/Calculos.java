package com.example.usuario.calculadora;

import android.widget.Toast;

public class Calculos
{
    public String[] ObtenerNumeros(String s)
    {
        return s.split(" ");
    }

    public Double Calcular(String[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }

        String operador = s[1];

        double total=0;
        switch(operador)
        {
            case "+":

            {
                total = Double.parseDouble(s[0]) + Double.parseDouble(s[2]);
                break;
            }

            case "-":
            {
                total = Double.parseDouble(s[0]) - Double.parseDouble(s[2]);
                break;
            }

            case "*":
            {
                total = Double.parseDouble(s[0]) * Double.parseDouble(s[2]);
                break;

            }

            case "/":
            {
                try
                {

                    double valor1= Double.parseDouble(s[0]);
                    double valor2= Double.parseDouble(s[2]);
                    boolean condicion = (valor2 == 0);
                    while(!condicion)
                    {
                        total = valor1 / valor2;
                        break;
                    }
                    if(condicion)
                    {

                        throw new ArithmeticException();
                    }

                }
                catch(ArithmeticException e)
                {

                    System.out.println("ERROR: IMPOSIBLE DIVIDIR POR 0");
                    System.out.println(e.getMessage());
                }
                finally
                {
                    System.exit(0);
                }

            }


        }
        return total;

    }

}
