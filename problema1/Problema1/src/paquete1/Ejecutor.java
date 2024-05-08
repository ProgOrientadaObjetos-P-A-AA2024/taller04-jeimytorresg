/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.LibretaNotas;
/**
 *
 * @author utpl
 */
public class Ejecutor {
    public static void main(String[] args){
        // objetos
        LibretaNotas libreta1 = new LibretaNotas("Suanny", 10, 9 , 10);
        LibretaNotas libreta2 = new LibretaNotas("Byron", 10, 9);
        // calculo promedio
        libreta1.calcularPromedio();
        libreta2.calcularPromedio();
        // presentacion
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }
}
