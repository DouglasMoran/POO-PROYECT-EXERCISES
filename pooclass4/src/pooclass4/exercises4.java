
package pooclass4;

import java.util.Scanner;

public class exercises4 {
   
    public static void main(String[] args) {
        System.out.print("Cantidad de salarios a calcular:  \n");
        Scanner in= new Scanner(System.in);
        int j=in.nextInt();
        
        for (int i = 0; i < j; i++) {
        
        double salario=0;
        Scanner inSalario = new Scanner(System.in);
        System.out.print("Ingrese salario: \n");
        salario = inSalario.nextDouble();
        
        deduciones(salario);
        }
    }
    
    private static void deduciones(double salario) {
       
        double afp   =(salario/100)*6.25;
        double isss  =(salario/100)*3;
        double renta =(salario/100)*7.1;
        double salarioDeducciones= (salario-(afp+isss+renta));
        
        System.out.println("Salario: "+ salarioDeducciones);
        System.out.println("AFP: "+ afp);
        System.out.println("ISSS: "+ isss);
        System.out.println("Renta: "+ renta);
}
    
    
}
