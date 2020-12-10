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

    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;

    }

    public void imprimirConsola() {

        System.out.println("El numero racional es: " + numerador + "/" + denominador);
    }

    public void suma(Racional x) {
        if (this.denominador == x.denominador) {

            this.numerador += x.numerador;

        } else {

            this.numerador = (this.numerador * x.denominador)
                    + (this.denominador * x.numerador);

            this.denominador *= x.denominador;
        }

    }

    public void producto(Racional x) {
        this.numerador = this.numerador * x.numerador;
        this.denominador = this.denominador * x.denominador;
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
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Racional{" + numerador / denominador + '}';
    }

}
