
package evaluacionteorica;

import java.util.Scanner;

public class exercises2_L {
    
    public static void main(String args []){
        
        /*Cree una aplicación para calcular el total a pagar por interés simple
        en periodos de años o meses. Debe preguntar al usuario qué período va a utilizar
        (meses o años), y a partir de eso, calcular el total a pagar en efectivo.
        La fórmula que utilizará es: 
        
        Is = Crt/100 si T está dado en años
        
        Is = Crt/1200 si T está en meses
        
        Donde:
        Is = es el interés simple obtenido del capital
        C = capital invertido
        r = es el rédito o porcentaje de interés anual
        t = número de períodos temporales
        */
        Scanner scanner = new Scanner(System.in);
        
        double C,r;
        int TF, t;
        System.out.println("Ingrese la cifra del Capital invertido:");
        C = scanner.nextDouble();
        
        System.out.println("Ingrese su rédito (interés anual): ");
        r = scanner.nextDouble();
        
        System.out.println("A continuación indique en qué estará dado sus períodos temporales?\n1) meses\n2) años\n3) días");
        TF = scanner.nextInt();
        
        switch(TF){
            case 1:
                //Is = Crt/1200 si T está en meses
                System.out.println("Ingrese el número de períodos temporales: ");
                t = scanner.nextInt();
                System.out.println("El interes generado es de: " + IsM(C,r,t) + "\nEl monto final es de: " + (C+IsM(C,r,t)) + " $");
            break;
            
            case 2:
                System.out.println("Ingrese el número de períodos temporales: ");
                t = scanner.nextInt();
                System.out.println("El interes generado es de: " + IsA(C,r,t) + "\nEl monto final es de: " + (C+IsA(C,r,t)) + " $");
            break;
            
            case 3:
                System.out.println("Ingrese el número de períodos temporales: ");
                t = scanner.nextInt();
                System.out.println("El interes generado es de: " + IsD(C,r,t) + "\nEl monto final es de: " + (C+IsD(C,r,t)) + " $");
            break;
            
            default:
            break;    
            
        }
    }
    
    public static double IsM(double C, double r,int t){
        //Is = Crt/1200 si T está en meses
        double isM,interesM;
        interesM = r*0.01;
        isM = (C*interesM*t)/1200;
        return isM;
    }
    
    public static double IsA(double C, double r, int t){
        //Is = Crt/100 si T está dado en años
        double isA,interesA;
        interesA = r*0.01;
        
        isA = (C*interesA*t);
        return isA;
    }
    
    public static double IsD(double C, double r, int t){
        double isD,interesD;
        interesD = r*0.01;
        isD = (C*interesD*t)/36000;
        return isD;
    }
    
}
