/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.ManejoCheques;
/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoCheques cheque1 = new ManejoCheques("Maria Serrano", "Banco de "
                + "Guayaquil", 300);
        ManejoCheques cheque2 = new ManejoCheques("Martin Jaramillo", 450);
        
        cheque1.calcularComisionCheque();
        cheque2.calcularComisionCheque();
        
        System.out.printf("%s\n",cheque1);
        System.out.printf("%s\n",cheque2);
    }
    
}
