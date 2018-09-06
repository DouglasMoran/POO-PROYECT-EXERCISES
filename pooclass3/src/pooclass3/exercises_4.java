
package pooclass3;

import java.util.Scanner;

public class exercises_4 {
    
    public static void main(String args []){
        
        /*4) Crear una aplicación que permita encontrar los divisores de un número ingresado en consola por el usuario.
        Debe utilizar el ciclo repetitivo for.*/
        
        Scanner scanner =  new Scanner(System.in);
        
        int num,div;
        div = 1;
        
        System.out.println("ENCONTRANDO LOS DIVISORES!!\n");
        System.out.println("Por favor ingrese el número a operar:");
        num = scanner.nextInt();
        System.out.println("\nSu número es, ");
        
        
        if(num < 0){
            System.out.println("NOTA: Por favor ingrese un número de tipo entero!!");
        }
        else if(num > 0){
            for(int i=1; i<num; i++){
            while(num % i == 0 && i < num){
                
                System.out.println("Divisible por: " + div);
                div = num/i;
                
                if(num / i == 2){
                    System.out.println("Divisible por: " + 2);
                }
                i++;
            }
         }
        }else{
            System.out.println("NOTA: Por favor ingrese un número de tipo entero!!");
        }
        
        
    }
    
    
}
