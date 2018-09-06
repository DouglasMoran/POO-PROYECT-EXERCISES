
package exercises2;

import java.util.Scanner;

public class Exercises2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        double celsius,fahren,conver;
        
        System.out.println("CONVERSOR DE GRADOS");
        
        System.out.println("Ingrese los grados celsius: ");
        celsius = scanner.nextFloat();
        
        conver = (celsius*1.8)+32;
        
        System.out.println("La temperatura en grados Fahrenheit es de: " + conver);
    }
    
}
