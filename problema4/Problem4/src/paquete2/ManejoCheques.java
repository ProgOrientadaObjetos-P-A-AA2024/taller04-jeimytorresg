/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class ManejoCheques {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public ManejoCheques(String c, String b, double cheque){
        nombreCliente = c;
        nombreBanco = b;
        valorCheque = cheque;
    }
    
    public ManejoCheques(String c, double cheque){
        nombreCliente = c;
        nombreBanco = "Banco de Loja";
        valorCheque = cheque;
    }
    
    public void establecerNombreCliente(String n){
        nombreCliente = n;
    }
    public void establecerNombreBanco(String n){
        nombreBanco = n;
    }
    public void establecerValorCheque(double n){
        valorCheque = n;
    }
    public void calcularComisionCheque(){
        comisionBanco = valorCheque * 0.00003;
    }
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    public String obtenerNombrBanco(){
        return nombreBanco;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }
    public double obtenerComisionBanco(){
        return comisionBanco;
    }
    @Override 
    public String toString(){
        String cadena = String.format("Manejo Cheque\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del Banco: %.2f\n", nombreCliente, nombreBanco,
                obtenerValorCheque(), obtenerComisionBanco());
        return cadena;
    }
}
