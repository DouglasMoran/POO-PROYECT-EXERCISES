
package guia_1_poo;

import java.util.Scanner;

public class exercises_7 {
    
    public static void main(String args []){
        
        //Crear una aplicación que muestre las tablas de multiplicar del 1 al 10. 
        //Debe utilizar exclusivamente estructuras repetitivas
        
        //1- pedir al usuario la tabla de multiplicar que desee que se le muestre
        //2- condición debe ser de números mayor o igual a 1 y menor a 10
        //3- utilizar una estructura repetitiva (while) 2505-8000
        //4- mostrar en modo lista al usuario la tabla
        
        Scanner scanner = new Scanner(System.in);
        
        int tabla;
        
        for(int i=1; i <= 10; i++){
            
            for(int j=1; j<=10; j++){
                
                tabla = i*j;
                System.out.println(i + "X" + j + "=" + tabla);
                if(i != j){
                    System.out.println("");  
                }else if(i == j){
                    System.out.println("");
                }
                
                if(i == j && i == 10){
                    System.out.println("-----------");
                }else if(i <  j && j >= 10){
                    
                    System.out.println("----------- ");
                }/*else if(i <  j && j >= 20){
                    System.out.println("------------");
                }/*else if(i <  j && j >= 30){
                    System.out.println("-------------");
                }else if(i <  j && j >= 40){
                    System.out.println("-------------");
                }else if(i <  j && j >= 50){
                    System.out.println("-------------");
                }else if(i <  j && j >= 60){
                    System.out.println("-------------");
                }else if(i <  j && j >= 70){
                    System.out.println("-------------");
                }else if(i <  j && j >= 80){
                    System.out.println("-------------");
                }else if(i <  j && j >= 90){
                    System.out.println("-------------");
                }*/
            } 
        }
        
    }
    
}
