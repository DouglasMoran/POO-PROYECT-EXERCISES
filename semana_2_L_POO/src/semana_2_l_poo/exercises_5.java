
package semana_2_l_poo;

import java.util.Scanner;


public class exercises_5 {
    
    public static void main(String args []){
        
        //Crear un programa que consulte el nombre de un personaje famoso
        //como Alejandro Magno, Albert Einstein, Gabriel García Márquez, Barak Obama
        //El cipitio
        
        //sino el nombre no es uno de ellos, mostrar:
        //"Nombre no encontrado"
        //En otro caso "Nombre encontrado!!"
        
        Scanner scanner = new Scanner(System.in);
        
        String AM,AE,GGG,BO,EC,requerido;
        
        AM = "Alejandro Magno"; 
        AE = "Albert Einstein";
        GGG = "Gabriel Garcia Marquez";
        BO = "Barak Obama";
        EC = "El cipitio";
        
        
        System.out.println("Ingrese el nombre del personaje que desea encontrar:");
        requerido = scanner.nextLine();
        
        if (requerido.equalsIgnoreCase(AM)){
            System.out.println("Nombre encontrado!!\n" + "Resultado:\n" + AM);
        }
        
        
        else if(requerido.equalsIgnoreCase(AE)){
            System.out.println("Nombre encontrado!!\n" + "Resultado:\n" + AE);
        }
        
        
        else if(requerido.equalsIgnoreCase(GGG)){
            System.out.println("Resultado:\n" + GGG);
        }
        
        
        else if(requerido.equalsIgnoreCase(BO)){
            System.out.println("Nombre encontrado!!\n" + "Resultado:\n" + BO);
        }
        
        
        else if(requerido.equalsIgnoreCase(AE)){
            System.out.println("Nombre encontrado!!\n" + "Resultado:\n" + EC);
        }
        else{
            System.out.println("Nombre no encontrado!!");
        }
        
       
    }
    
}
