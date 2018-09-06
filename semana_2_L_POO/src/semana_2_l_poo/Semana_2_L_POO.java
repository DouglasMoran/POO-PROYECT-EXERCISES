
package semana_2_l_poo;

import java.util.Scanner;


public class Semana_2_L_POO {

    public static void main(String[] args) {
        
        //Realice un programa que divida 2 números y evite la división por 0 (cero)
        
        Scanner scanner = new Scanner(System.in);
        
        double num1,num2,div;
        
        System.out.println("PARA REALIZAR LA DIVISIÓN INGRESE LOS DATOS QUE SE PIDEN:\n");
        
        System.out.println("Ingrese número 1:");
        num1 = scanner.nextDouble();
        
        System.out.println("Ingrese número 2:");
        num2 = scanner.nextDouble();
            
                if(num2 == 0){
                    System.out.println("NOTA: No esta permitido dividir valores en base: " + num2 + "\n");
                    System.out.println("ERROR!");
                }
                else{
                    div = num1/num2;
                    System.out.println("El resultado de la división es de: " + div);
                }
                
    }
    
}
