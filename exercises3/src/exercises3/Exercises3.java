
package exercises3;

import java.util.Scanner;

public class Exercises3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        double nota1,nota2,nota3,promedio;
        
        System.out.println("Ingrese nota 1: ");
        nota1 = scanner.nextDouble();
        
        
        System.out.println("Ingrese nota 2: ");
        nota2 = scanner.nextDouble();
         
        System.out.println("Ingrese nota 3: ");
        nota3 = scanner.nextDouble();
        
        promedio = (nota1+nota2+nota3)/3;
        
        System.out.println("El promedio de las notas es de: " + promedio);
        
        
    }
    
}
