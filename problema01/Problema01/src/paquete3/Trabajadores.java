/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author JEanpa
 */
public class Trabajadores {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private int mesSueldo;

    public Trabajadores(String c, String n, String co, double sue, int mesS) {
        cedula = c;
        nombre = n;
        correo = co;
        sueldo = sue;
        mesSueldo = mesS;

    }

    public Trabajadores() {

    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCorreo(String correo) {
        this.correo = correo;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void establecerMesSueldo(int mesSueldo) {
        this.mesSueldo = mesSueldo;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerMesSueldo() {
        return mesSueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula:%s\n"
                + "Nombre:%s\n"
                + "Correo:%s\n"
                + "Sueldo:%.2f\n"
                + "Mes sueldo:%d\n",
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo()
        );
        return cadena;
    }

}
