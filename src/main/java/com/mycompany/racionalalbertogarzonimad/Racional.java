/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalbertogarzonimad;

/**
 *
 * @author alberto
 */
public class Racional {
    //Atributos privados numerador y denomirador
    private int numerador;
    private int denominador;
    //Constructor por defecto, indicando como numerador y denominador el valor 1.
    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }
//Constructor parametrizado. 

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        //Controlamos que si el denominador no es cero, en tal caso asignamos el valor a 1.
        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;

    }
// Método imprimirConsola(), que imprimirá por consola el número racional

    public void imprimirConsola() {

        System.out.println("El numero racional es: " + numerador + "/" + denominador);
    }
//Método suma(Racional x),  sumará al racional que llama al método el valor del número racional que recibe como argumento. 
    public void suma(Racional x) {
        if (this.denominador == x.denominador) {

            this.numerador += x.numerador;

        } else {

            this.numerador = (this.numerador * x.denominador)
                    + (this.denominador * x.numerador);

            this.denominador *= x.denominador;
        }

    }
    
    
    //Método resta(Racional x), realizara la resta al racional llamanado al metodo cuyo valor (numero racional) es recibido como argumento. 
    public void resta(Racional x) {
        if (this.denominador == x.denominador) {

            this.numerador -= x.numerador;

        } else {

            this.numerador = (this.numerador * x.denominador)
                    - (this.denominador * x.numerador);

            this.denominador *= x.denominador;
        }

    }
//Método producto(Racional x), que guardará en los atributos del objeto que hace la llamada la siguiente información:
    public void producto(Racional x) {
        this.numerador = this.numerador * x.numerador;
        this.denominador = this.denominador * x.denominador;
    }
    
     //Método estático que divide dos números racionales
    public static Racional division(Racional racional1, Racional racional2) {

        return new Racional(racional1.numerador *= racional2.denominador, racional1.denominador *= racional2.numerador);
    }
    //Método de clase igualdad(Racional x, Racional y) 
    //que devolverá si el Racional x es igual al Racional y

   public static boolean igualdad(Racional x, Racional y) {
        if (x.getNumerador() == y.getNumerador()&& x.getDenominador() == y.getDenominador()) {
            return true;
        }else{
            return false;
        }
        
    }
   //metodos Get
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    //metodos Set
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;
    }
//Método toString(), que devolverá una cadena de texto con el siguiente formato "a/b".
    @Override
    public String toString() {
        return "Racional{" + numerador / denominador + '}';
    }

}
