
package pooclass3;

import java.util.Scanner;

public class Pooclass3 {

    public static void main(String[] args) {

        /*
        contado1= 1;
        contador2 = 1;
        contador = suma de los dos anteriores más contador;
            1) Realice la serie de Fibonacci para un número inferior de 1000:
            
            La sucesión comienza con los números 1 y 1, y a partir de estos, 
            «cada término es la suma de los dos anteriores», es la relación de recurrencia que la define.
            Utilice el ciclo while o do while
        
        Los números de Fibonacci quedan definidos por la ecuación:
        
        fn+1/fn
        
        f0 = 0;
        f1 = 1;
        
        fn = fn-1+fn-2;
             1-1+1-2;

        */
        Scanner scanner = new Scanner(System.in);
        
        int num,formula,contador1,contador2,contador,restriccion;
        contador1 = 0;
        contador2 = 1;
        contador = 0;
        
        
        System.out.println("Bienvenido a Fibonacci Formula\n");
        
        System.out.println("Por favor ingrese los datos que se le piden a continuación:\n");
        System.out.println("Ingrese el valor de un número:");
        num = scanner.nextInt();
        
        if(num <= 900){
            
            System.out.println(contador1);
            System.out.println(contador2);
            
            do{
               
                contador = contador1 + contador2;
                System.out.println(contador);
                contador1 = contador2;
                contador2 = contador; 
            }while(contador + contador1 < num);
            
        }else{
            System.out.println("NOTA: El número debe ser menor a 1,000 y de tipo entero");
            
        }
        
        
    }
    
}
