
package guia_1_poo;

import java.util.Scanner;

public class exercises_3 {
    
    public static void main(String args []){
        
        //Crear una aplicación que permita encontrar la fuerza de atracción gravitacional de dos cuerpos
        //Formula: F1 = F2 = G m1*m2/r*r
        //Pedir al usuario:
        /*
        1- masa 1
        2- Fuerza 1
        3- masa 2
        4- Fuerza 2
        5- (preguntr qué significa r) r
        
        6- G = 6.67*Math.pow(10,11) * m1*m2/r*r
        */
        
        Scanner scanner = new Scanner(System.in);
        
        double m1,m2,F1,F2,r,fg;
        
        System.out.println("Para poder encontrar la FG (Fuerza Gravitacional),\n"
                + "le pedimos que ingrese los siguientes datos\n");
        
        System.out.println("Ingrese el valor de m1(masa uno) obtenida: ");
        m1 = scanner.nextDouble();
        
        /*System.out.println("Ingrese el valor de F1(Fuerza uno) obtenida: ");
        F1 = scanner.nextDouble();*/
        
        System.out.println("Ingrese el valor de m2(masa dos) obtenida: ");
        m2 = scanner.nextDouble();
        
        /*System.out.println("Ingrese el valor de F2(Fuerza dos) obtenida: ");
        F2 = scanner.nextDouble();*/
        
        System.out.println("Ingrese el valor de r() obtenido: \n");
        r = scanner.nextDouble();
        
        System.out.println("Los datos ingresados: \n");
        
        System.out.println("m1 = " + m1 + " Kg");
        //System.out.println("F1 = " + F1 + " N");
        System.out.println("m2 = " + m2 + " Kg");
        //System.out.println("F2 = " + F2 + " N");
        
        
        fg = 6.67*Math.pow(10,-11)*((m1*m2)/(r*r));
        
        System.out.println("\nLa Fuerza es equivalente a: " + fg + " N");
        
    }
    
}
