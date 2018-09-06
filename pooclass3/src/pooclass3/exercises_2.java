
package pooclass3;

import java.util.Scanner;

public class exercises_2 {
    
    public static void main(String args []){
        /*Se solicita a usuario que ingrese un número entero positivo, 
        y luego se le indicará si el número ingresado es o no PRIMO. 
        Si no es primo, muéstrele por qué no es primo. 
        Recuerde que un número entero es primo cuando es divisible únicamente por el mismo y por la unidad.

        Ejemplos de números primos: 1, 5, 13, 37, etc. 
        porque cualquiera de ellos, es divisible por uno (1) y el mismo.

        Ejemplo de número no primo: 
        42, porque además de ser divisible por 42 y por 1, 
        también es divisible por 2, divisible por 3, divisible por 6, 
        divisible por 7, divisible por 14, y divisible por 21*/
        
        Scanner scanner = new Scanner(System.in);
        
        int num,divisores,div,primos;
        div = 1;
        System.out.println("¡¡ENCONTRANDO A LOS PRIMOS!!\n");
        
        System.out.println("ADVERTENCIA: Solicitamos que ingrese un número con valor de tipo entero\n" + "\nIngrese el número que desea:");
        num = scanner.nextInt();
        
        if(num < 0){
            System.out.println("\nNOTA: Por favor Ingrese un número de tipo entero para poder continuar");
        }
        else if(num % 2 == 0){
            System.out.println("\nNOTA: El número ingresado" + " NO ES PRIMO porque es:");
            //System.out.println("Porque es divisible por: ");
            for(int i=1; i<num; i++){
                
                while(num % i == 0 && i < num){
                     System.out.println("Divisible por: " + div);
                     //System.out.println("");
                     div = num/i;
                     //condición para divisor de 2
                     // num / i == 2 
                     if(num/i == 2){
                         System.out.println("Divisible por: " + 2);
                     }
                     i++;  
                }
            }   
        }else if(num == 1){
            System.out.println("\nNOTA: El número ingresado" + " NO ES PRIMO");
        }
        else if(num % 2 != 0){
            System.out.println("\nNOTA: El número ingresado" + " ES PRIMO" + "\n -PORQUE SOLO ES DIVISIBLE ENTRE EL MISMO Y LA UNIDAD (1)");
             
        }else{
            System.out.println("Detectamos que posiblemente esta utilizando números con decimales, ingrese solo de tipo entero");
        }
         
    }
    
    
}
