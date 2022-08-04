/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.EnlaceBD;
import paquete3.Trabajadores;

/**
 *
 * @author JEanpa
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnlaceBD e = new EnlaceBD();
        Scanner entrada = new Scanner(System.in);
        String cedula, correo, nombre;
        double sueldo;
        int mesSueldo;

        int op;

        do {
            System.out.println("Ingrese cedula del trabajador");
            cedula = entrada.nextLine();
            System.out.println("Ingrese nombre del trabajador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese correo del trabajador");
            correo = entrada.nextLine();
            System.out.println("Ingrese sueldo");
            sueldo = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el mes de sueldo");
            mesSueldo = Integer.parseInt(entrada.nextLine());
            Trabajadores st = new Trabajadores(cedula, nombre, correo, sueldo, mesSueldo);
            e.insertarSueldoTrabajadores(st);

            System.out.println("Ingrese 0 para salir");
            op = Integer.parseInt(entrada.nextLine());

        } while (op != 0);

    }

}
