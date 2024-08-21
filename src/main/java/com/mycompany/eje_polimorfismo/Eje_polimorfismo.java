/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje_polimorfismo;

/**
 *
 * @author ebers
 */
public class Eje_polimorfismo {

    public static void main(String[] args) {
        
       Animal miAnimal;

        miAnimal = new Perro();
        miAnimal.hacerSonido();  // Salida: El perro ladra

        miAnimal = new Gato();
        miAnimal.hacerSonido();  // Salida: El gato maúlla
    }
}
