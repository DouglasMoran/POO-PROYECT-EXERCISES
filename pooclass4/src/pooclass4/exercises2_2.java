
package pooclass4;

import java.util.Scanner;

public class exercises2_2 {
    
    public static void main(String args []){
        
        /*Ejemplo mostrar al usuario la raíz cuadrada de su número ingresado*/
        
        Scanner scanner = new Scanner(System.in);
        
        double raiz;
        
        System.out.println("TE MOSTRAREMOS LA RAÍZ CUADRADA DEL NÚMERO QUE INGRESES!!\n");
        System.out.println("Ingresa el número del cual deseas saber su raíz cuadrada:");
        raiz = scanner.nextDouble();
       
        if(raiz > 0){
            System.out.println("La raíz cuadrada de: " + raiz + " es:  " + raizCuadrada(raiz));
        }else{
            System.out.println("NOTA: Por favor ingresar números mayores a 0 (número > 0)");
        }
        
    
    }
    
    public static double raizCuadrada(double raiz){
        return Math.sqrt(raiz);
    }
    
}
