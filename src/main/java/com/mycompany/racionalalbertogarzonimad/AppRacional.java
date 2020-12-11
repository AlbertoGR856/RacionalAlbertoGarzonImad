/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalbertogarzonimad;

/**
 *
 * @author GR6
 */
public class AppRacional {

    public static void main(String[] args) {

        //Creamos dos numeros racionales con los siguientes valores
        Racional racionalZ = new Racional(4, 5);

        Racional racionalK = new Racional(3, 4);

        //Creamos un racional aleatorio.
        Racional prueba1 = new Racional();

        prueba1 = Racional.aleatorio();

        //Imprimo los tres racionales y limitamos la salida a dos decimales.
        System.out.printf("Racionalz: %.2f \n", (float) racionalZ.getNumerador() / racionalZ.getDenominador());
        System.out.printf("Racionalk: %.2f \n", (float) racionalK.getNumerador() / racionalK.getDenominador());
        System.out.printf("Aleatorio prueba1: %.2f \n", (float) prueba1.getNumerador() / prueba1.getDenominador());

        //Realizo la suma
        racionalZ.suma(racionalK);
        System.out.println("El resultado de la suma es: " + racionalZ.toString());

        //Comparamos los dos racionales, comprobando su igualdad
        System.out.println(Racional.igualdad(racionalZ, racionalK));

        //Se muestra la division de los dos racionales, guardando el resultado de la división en un nuevo objeto de tipo Racional
        Racional resultadoDivision = Racional.division(racionalZ, racionalK);
        System.out.println("El resultado de dividir Z y K es: " + resultadoDivision);

    }

}
