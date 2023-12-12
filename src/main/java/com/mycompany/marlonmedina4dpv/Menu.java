
package com.mycompany.marlonmedina4dpv;

import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int opc;
        
        Paciente p1 = new Paciente();
        
        System.out.println("Ingrese Nombre");
        p1.nombre = input.next();
        
        System.out.println("Ingrese Rut");
        p1.rut = input.next();
        
        System.out.println("Ingrese Genero\n"
                + "1. Hombre \n"
                + "2. Mujer \n")
        ;
        opc = input.nextInt();
        
        switch (opc) {
            case 1:
                p1.genero = "Hombre";
                break;
                
            case 2:
                p1.genero = "Mujer";
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("Ingrese Altura");
        p1.altura = input.nextDouble();
        
        System.out.println("Ingrese Peso");
        p1.peso = input.nextDouble();
        
       p1.CalcularImc();
       p1.EstadoFisico();
       p1.MostrarDatos();
       
    }
    
}
