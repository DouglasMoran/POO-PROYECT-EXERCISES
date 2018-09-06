
package semana_2_l_poo;

import java.util.Scanner;


public class exercises_3 {
    
    public static void main(String args []){
    
    //Programa que calcule el valor de f(x)    
    //f(x)= (x2 + 1)/(x-1)
        
        Scanner scanner = new Scanner(System.in);
        
        int x,fx;
        
        System.out.println("Para calcular F(x) ingrese el valor que se le solicita:");
        
        System.out.println("Ingrese el valor de X:");
        x = scanner.nextInt();
        
        if(x > 1){
            fx = (x*x)+1/(x-1);

           System.out.println("El resultado de F(x) es: " + fx );   
        }else{
            System.out.println("NOTA: El valor de x debe ser x>1");
        }
        
    }
    
}
