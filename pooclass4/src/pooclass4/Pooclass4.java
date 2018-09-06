
package pooclass4;

import java.util.Scanner;

public class Pooclass4 {

     
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
       
        System.out.println("Ingrese el valor del radio:");
        double radio = Double.parseDouble(in.nextLine());
        getArea(radio);
    }
 
    private static void getArea(double radio){
        
        Scanner inText = new Scanner(System.in);
        
        if( radio >= 0){
        System.out.println("¿Que medida desea calcular cm o m.?:");
        String medida;
        medida = inText.nextLine();
        
        switch(medida){
            case "cm":
            double totalCm;
            totalCm = (Math.PI*(Math.pow(radio,2)));
            System.out.println("Área: "+(totalCm)+ "cm^2");             
                
                break;
                
            case "m":
            double totalM;
            totalM = (Math.PI*(Math.pow(radio,2)));
            System.out.println("Área: "+(totalM)+ "m^2");
            break;
                
            default:
                System.out.print("No se puede realizar");
                break;
        }
        }else{
            System.out.print("El valor que ingreso es negativo, Fin del proceso.");
        }
       

    }
    
}
