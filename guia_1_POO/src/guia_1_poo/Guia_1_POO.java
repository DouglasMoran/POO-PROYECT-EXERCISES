
package guia_1_poo;

import java.util.Scanner;


public class Guia_1_POO {

    public static void main(String[] args) {
        
        //Ejercicio 2
        
        /*
        Tres accionistas (Ludovico P, Kirian L y  Jordan Belfort) 
        desean comprar una serie de empresas. Ludovico P aportará el 37% de la inversión, 
        Kirian 29.2% y el resto correrá por parte de Jordan. 
        La aplicación debe solicitar el costo total de la empresa que desean comprar e indicar 
        cuánto pagará cada uno de los accionistas
        */
        
        //1.sacar el 37% de Ludovido
        //2.para Kirian 29.2%
        //3.resto para Jordan
        
        //1.1-Pedir costo de empresa
        //1.2-Mostrar cuánto aportara cada uno
        Scanner scanner = new Scanner(System.in);
        
        double ludovico, kirian, jordan, costoEmpresa, inversionL, inversionK, inversionJ, costoF;
     
        ludovico = 37;
        kirian = 29.2;
        jordan = 33.8;
        
        System.out.println("Ingrese costo de la empresa:");
        costoEmpresa = scanner.nextDouble();
        
        inversionL = (costoEmpresa*ludovico)/100;
        inversionK = (costoEmpresa*kirian)/100;
        inversionJ = (costoEmpresa*jordan)/100;
        
        System.out.println("LOS COSTOS QUE CORRESPONDE A CADA UNO DE LOS ACCIONISTAS SERÁ DE:\n");
        System.out.println("Ludovico P. Invertirá un total de: " + "$" + inversionL);
        System.out.println("Kirian L. Invertirá un total de: " + "$" + inversionK);
        System.out.println("Jordan Belfort, invertirá un total de: " + "$" + inversionJ + "\n");
        
        costoF = inversionL + inversionK + inversionJ;
        System.out.println("Completando el costo final de la empresa que es de: " + "$" + costoF);
        
    }
    
}
