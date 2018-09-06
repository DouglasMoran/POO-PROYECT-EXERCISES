
package guia_1_poo;

import java.util.Scanner;

public class exercises_8 {
    
    public static void main(String[] args) {
        
        //Crear una aplicación que permita calcular el factorial de un número
        
        //1- pedir número a operar al usuario
        //2- formula para factorial es: x! <=> x*xn*xn*xn...
        //3- utilizar for con el contador i
        //4- mostrar el resultado de la operación al usuario
        
        Scanner scanner = new Scanner(System.in);
        
        int num,factorial,i;
        factorial = 1;
        
        System.out.println("Ingrese el número a factorizar: ");
        num = scanner.nextInt();
        
        if(num < 0){
            System.out.println("NOTA: No se puede sacar el factorial de un número negativo");
        }
        
        else{
            for (i = num; i > 0; i--) {
            factorial = factorial*i;
            }
            System.out.println("El factorial de: " + num + " es: " + factorial);
        }
          
    }
    
}
