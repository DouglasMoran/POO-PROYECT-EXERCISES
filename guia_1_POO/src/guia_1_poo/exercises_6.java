
package guia_1_poo;

import java.util.Scanner;


public class exercises_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Uso de estructura de control switch Crear una aplicación 
        //que convierta los números del 0 al 25 en letras. 
        
        //1- pedir número
        //2- 
        
        int num;
        
        System.out.println("Ingrese el número:");
        num = scanner.nextInt();
       
        
        switch (num){
           
            case 0:
                System.out.println("\ncero");
                break;
            
            case 1:
                System.out.println("\nuno");
                break;
        
            case 2:
                System.out.println("\ndos");
                break;
                
            case 3:
                System.out.println("\ntres");
                break;
                
            case 4:
                System.out.println("\ncuatro");
                break;    
                
            case 5:
                System.out.println("\ncinco");
                break;
                
            case 6:
                System.out.println("\nseis");
                break;    
            case 7:
                System.out.println("\nsiete");
                break;
                
            case 8:
                System.out.println("\nocho");
                break;
                
            case 9:
                System.out.println("\nnueve");
                break;
                
            case 10:
                System.out.println("\ndiez");
                break;
                
            case 11:
                System.out.println("\nonce");
                break;
                
                
            case 12:
                System.out.println("\ndoce");
                break;
                
            case 13:
                System.out.println("\ntrece");
                break;
                
            case 14:
                System.out.println("\ncatorce");
                break;
                
            case 15:
                System.out.println("\nquince");
                break;
               
            case 16:
                System.out.println("\ndiesiseis");
                break;
                
            case 17:
                System.out.println("\ndiessiete");
                break;
               
            case 18:
                System.out.println("\ndiesiocho");
                break;
                
            case 19:
                System.out.println("\ndiesinueve");
                break;    
                
            case 20:
                System.out.println("\nveinte");
                break;
                
            case 21:
                System.out.println("\nveintiuno");
                break;
                
                
            case 22:
                System.out.println("\nveintidos");
                break;
                
                
            case 23:
                System.out.println("\nveintitres");
                break;
                
                
            case 24:
                System.out.println("\nveinticuatro");
                break;    
                
                
            case 25:
                System.out.println("\nveinticinco");
                break; 
                
            default:
                System.out.println("se operan números hasta el 25");
                break;
             
        } 
      
    }
}
