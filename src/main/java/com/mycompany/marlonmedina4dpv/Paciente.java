
package com.mycompany.marlonmedina4dpv;


public class Paciente {
    
    String nombre;
    String rut;
    String genero;
    double peso;
    double altura;
    double imc;
    
    public void CalcularImc(){
        
        imc = peso / (altura * altura);
    
    }
    
    public void MostrarDatos(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + imc);
    };

    public void EstadoFisico(){
    
        switch (genero) {

            case "Hombre":

                if (imc < 20) {

                    System.out.println("IMC: " + imc + " Bajo Peso");

                }else if(imc <= 24.9){

                    System.out.println("IMC: " + imc + " Normal");

                }else if (imc <= 29.9) {

                    System.out.println("IMC: " + imc + " Obesidad Leve");

                }else if (imc <= 40) {

                    System.out.println("IMC: " + imc + " Obesidad Severa");

                }else if (imc > 40) {

                    System.out.println("IMC: " + imc + " Obesidad muy Severa");

                }

                break;

            case "Mujer":

                if (imc < 20) {

                    System.out.println("IMC: " + imc + " Bajo Peso");

                }else if(imc <= 23.9){

                    System.out.println("IMC: " + imc + " Normal");

                }else if (imc <= 28.9) {

                    System.out.println("IMC: " + imc + " Obesidad Leve");

                }else if (imc <= 37) {

                    System.out.println("IMC: " + imc + " Obesidad Severa");

                }else if (imc > 37) {

                    System.out.println("IMC: " + imc + " Obesidad muy Severa");

                }                

            break;
        }
    }
    
}
