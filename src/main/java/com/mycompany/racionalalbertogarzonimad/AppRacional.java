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

        prueba1 = prueba1.aleatorio();
    }

}
