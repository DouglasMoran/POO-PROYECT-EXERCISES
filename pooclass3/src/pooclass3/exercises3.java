
package pooclass3;

import java.util.Scanner;

public class exercises3 {
    
    public static void main(String args []){
        
        /*
        3) Realice un programa que permita hacer deducciones sobre un sueldo neto. 
        Las deducciones que se aplican son isss (3%), afp (6.25%), renta (7.1%).
        El resultado debe aparecer como se muestra a continuación.
        Sueldo: 450
        Renta: 31.95
        AFP: 28.125
        Isss: 13.5
        Total a pagar: 376.425

        El programa debe realizar los cálculos que el usuario desee. 
        (utilice la estructura repetitiva do…while), y preguntarle si desea continuar.*/
        
        //1- pedir sueldo neto
        //2- mostrar las deducciones que el usuario puede cotizar 
        //3- 
        
        Scanner scanner = new Scanner(System.in);
        
        double sueldo,renta,afp,isss,total,deduccion,deducRENTA,deducAFP,deducISSS,r,a,i,TT,sdd;
        String opcion,continuar,si;
        
        renta = 7.1;
        afp = 6.25;
        isss = 3;
        
        si = "SI";
        
        do{
        
        System.out.println("AHORA PUEDES COTIZAR TUS DEDUCCIONES DE UNA MANERA MÁS FACIL" + "\n(Solo ingresa los datos que se requieran y sigue las indicaciones)");
        System.out.println("\nPor favor ingrese el sueldo neto: ");
        sueldo = scanner.nextDouble();
        System.out.println("Nota: Esto nos servirá para poder realizar sus deducciones de una manera más precisa!!");
        System.out.println("\n¡Se muestra el porcentaje de deducción por cada una de las prestaciones!");
        System.out.println("\n \tRENTA = 7.1%" + "\tAFP = 6.25%" + "\tISSS = 3%");
        System.out.println("\nPor favor escoga las deducción que desea cotizar en específico o  "
                + "\npuede seleccionar el item respectivo para que se le muestren todas las deducciones: ");
        System.out.println("1" + ") Renta " + "\n2" + ") AFP" + "\n" + "3" + ") ISSS" + "\n4" + ") TODAS LAS DEDUCCIONES");
        opcion = scanner.next();
        
        deducRENTA = (sueldo*renta)/100;
        deducAFP = (sueldo*afp)/100;
        deducISSS = (sueldo*isss)/100;
        
        switch(opcion){
            
            case "1":
                //renta 7.1
                r = sueldo - deducRENTA;
                System.out.println("\nEl porcentaje de deducción de renta es del: 7.1%"
                        + "\nSu sueldo ingresado es de: " + "$ " +  sueldo + "\nRenta: " + "$ " + deducRENTA);
                
                System.out.println("\nCon la deducción de la RENTA su sueldo es:" + "$ " + r);
            break;
            
            case "2":
                //AFP 6.25
                a = sueldo - deducAFP;
                System.out.println("\nEl porcentaje de deducción de AFP es del: 6.25%"
                        + "\nSu sueldo ingresado es de: " + "$ " +  sueldo + "\nAFP: " + "$ " + deducAFP);
                
                System.out.println("\nCon la deducción del AFP su sueldo es: " + "$ " + a);
            break;
            
            case "3":
                i = sueldo - deducISSS;
                System.out.println("\nEl porcentaje de deducción del ISSS es del: 3%"
                        + "\nSu sueldo ingresado es de: " + "$ " +  sueldo + "\nISSS: " + "$ " + deducISSS);
                
                System.out.println("\nCon la deducción del ISSS su sueldo es: " + "$ " + i);
            break;
            
            case "4":
                sdd = deducRENTA + deducAFP + deducISSS;
                TT = sueldo - sdd;
                System.out.println("Sueldo: " + sueldo + "\nRENTA: " + " $ " + deducRENTA + "\nAFP: " + " $ " + deducAFP + "\nISSS:" + " $ " + deducISSS
                + "\nTOTAL A PAGAR: " + TT
                );
            break;  
        }
        
        System.out.println("¿Desea continuar?");
        continuar = scanner.next();
        
        }while(continuar.equalsIgnoreCase(si));
    }
    
}
