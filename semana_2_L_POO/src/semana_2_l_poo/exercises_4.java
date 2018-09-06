
package semana_2_l_poo;

import java.util.Scanner;

public class exercises_4 {
    
    public static void main(String args []){
        
        //F(x) = (1_2 +2(1)+1)/2
        
         Scanner scanner = new Scanner(System.in);
        
        double x,fx;
        
        System.out.println("Para calcular F(x) ingrese el valor que se le solicita:");
        
        System.out.println("Ingrese el valor de X:");
        x = scanner.nextInt();
              
        fx =  ((x*x)+2*x+1)/2;
        
        System.out.println("El resultado de F(x) es: " + fx );   
        
          
        
    }
    
}
