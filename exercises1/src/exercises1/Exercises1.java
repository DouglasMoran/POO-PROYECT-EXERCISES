
package exercises1;

import java.util.Scanner;

public class Exercises1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double dolar,euros,conver,totaleuros;
        
        euros = 0.92076792;
        
        System.out.println("CONVERSOR DE DÓLAR A EUROS");
        System.out.println("Ingrese cantidad de dólar a convertir: ");
        dolar = scanner.nextDouble();
        
        
        conver = dolar*euros;
        
        
        System.out.println("El equivalente de dolares ingresados son de: " + conver);
        
        
        
    }
    
}
