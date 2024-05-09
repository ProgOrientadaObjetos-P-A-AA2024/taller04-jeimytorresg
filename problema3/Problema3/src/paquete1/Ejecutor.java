/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Automotores;
/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotores auto1 = new Automotores("1102938475", "Hyundai", 2013, 34000);
        Automotores auto2 = new Automotores("1102936283", "Toyota");
        
        auto1.calcularValorMatricula();
        auto2.calcularValorMatricula();
        
        System.out.printf("%s\n", auto1);
        System.out.printf("%s\n", auto2);
        
    }
    
}
