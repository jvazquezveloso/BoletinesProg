/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author Juan
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Satelite sat = new Satelite();
        Satelite sat2 = new Satelite(30,40,600);
        System.out.println("Posicion satélite 1");
        sat.verPosicion();
        System.out.println("Posicion satélite 2");
        sat2.verPosicion();
    }
    
}
