
package semana_2_l_poo;

import java.util.Scanner;

public class exercises_2 {
    
    public static void main(String args []){
        
        //Realize un programa que permita hacer deducciones según un sueldo neto
        //deducciones a aplicar son:
        //isss 3%
        //afp 6.25%
        //renta 7.1%
        
        Scanner scanner = new Scanner(System.in);
        
        double isss,afp,renta,sueldo,totalPago, desc_isss,desc_afp,desc_rent;
        
        System.out.println("Ingrese sueldo:");
        sueldo = scanner.nextDouble();
        
        System.out.println("Las deducciones que se cobrarán son las siguientes:\n"
                + "isss = 3%\t"
                + "afp = 6.25%\t"
                + "renta = 7.1&\n");
        
        isss = 3;
        afp = 6.25;
        renta = 7.1;
        
        desc_isss = (sueldo*3)/100;
        desc_afp = (sueldo*6.25)/100;
        desc_rent = (sueldo*7.1)/100;
        
        System.out.println("Sueldo: " + "$" + sueldo + "\n");
        System.out.println("Isss: " + "$" + desc_isss + "\n");
        System.out.println("AFP: " + "$" + desc_afp + "\n");
        System.out.println("Renta: " + "$" + desc_rent + "\n");
        
        totalPago = sueldo - (desc_isss + desc_afp + desc_rent);
        System.out.println("Total a pagar: " + "$" + totalPago);
        
    }
    
}
