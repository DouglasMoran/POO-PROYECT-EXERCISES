
package guia_1_poo;

import java.util.Scanner;


public class exercises_4 {
    
    public static void main(String args []){
        
        /*Crear una calculadora de índice de masa corporal.  La fómula a utilizar es:  
 
IMC= peso/altura*2 
        El peso sebe estar dado en kilogramos 
        La altura debe estar dada en metros 
 
Del resultado obtenido, debe indicar el usuario en 
        qué rango de la siguiente tabla se encuentra: 
 
Infrapeso  IMC menos de 18.5 
        Peso Normal  IMC de 18.5 a 24.9 
        Sobrepeso  IMC de 25 a 29.9 
        Obesidad  IMC 30 o 
        mayor Obesidad Mórbida IMC 40 o mayor 
 
 */
        Scanner scanner= new Scanner(System.in);
        
        double IMC, peso, altura, infraPeso;
        System.out.println("NOTA: ingresar el peso en kg y la altura en m(metros) \n ");
        
        System.out.println("Ingrese su Peso:");
        peso=scanner.nextDouble();
        
        
        System.out.println("Ingrese su altura:");
        altura=scanner.nextDouble();
        
        System.out.println("\nEl peso que ha indicado es : " + peso + " Kg");
        System.out.println("La altura que ha indicado es : " + altura + " m");
        
        IMC = peso/Math.pow(altura, 2);
        
        
        if ( IMC < 18.5  ){
            System.out.println("SU INDICE DE MASA CORPORAL (IMC)" + " infrapeso");
        }
        else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("\nSU INDICE DE MASA CORPORAL (IMC): " + IMC + "\nSe encunetra en un rango de:"
                    + " PESO NORMAL");
        }
        else if ( IMC >= 25  && IMC <= 29.9){
           System.out.println("\nSU INDICE DE MASA CORPORAL (IMC):" + IMC + "\nSe encunetra en un rango de:"
                   + " Sobre Peso");
        }
        else if ( IMC >= 30  && IMC <= 39 ){
            System.out.println("\nSU INDICE DE MASA CORPORAL (IMC):" + IMC + "\nSe encunetra en un rango de:"
                    + " Obesidad");
        }
        else if ( IMC >= 40 ){
            System.out.println("\nSU INDICE DE MASA CORPORAL (IMC):" + "\nSe encunetra en un rango de:"
                    + " Obesidad Morbida ");
        }
        
    }
    
    
}
