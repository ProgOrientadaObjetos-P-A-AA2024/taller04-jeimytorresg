/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.RegistroProfesores;
/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroProfesores profesor1 = new RegistroProfesores("Jose", "Ruiz",
                "11029387736", 500);
        RegistroProfesores profesor2 = new RegistroProfesores("Manuela","Torres",
                "11203947568");
        profesor1.calcularSueldoTotal();
        profesor2.calcularSueldoTotal();
        System.out.printf("%s\n", profesor1);
        System.out.printf("%s\n", profesor2);
    }
    
}
