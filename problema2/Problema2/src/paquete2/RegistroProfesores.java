/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class RegistroProfesores {

    private String nombre;
    private String apellidos;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    // constructores
    
    public RegistroProfesores(String n, String a, String c, double x) {
        nombre = n;
        apellidos = a;
        cedula = c;
        sueldoBasico = x;
    }
    
    public RegistroProfesores(String n, String a, String c) {
        nombre = n;
        apellidos = a;
        cedula = c;
        sueldoBasico = 460;
    }

    public void establecerNombres(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellidos = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = 1.2 * sueldoBasico;
    }

    public String obtenerNombres() {
        return nombre;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Registro: "
                + "Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n", obtenerNombres(), apellidos, cedula,
                obtenerSueldoBasico(), sueldoTotal);
        return cadena;
    }

}
