
package guia_1_poo;

import java.util.Scanner;

public class exercises_5 {
   
    public static void main(String[] args) {
        
        /*Crear una aplicación que permita calcular la comisión de un vendedor. 
        Si el vendedor tiene una venta menor de $100 no tendrá comisión. 
        Si el vendedor ha vendido $100 hasta menos de $200 recibe el 3% de comisión. 
        Si ha vendido entre $200 y menos de $400 tiene 6% de comisión. $400 o más, tiene 10% de comisión. 
        */
        Scanner scanner=new Scanner(System.in);
        
      double total_venta, comision_1, comision_2, comision_3, bono_1, bono_2, bono_3;
      
        System.out.println("Ingrese el total de ventas realizadas ");
        total_venta=scanner.nextDouble();
        
        if(total_venta < 100){
            
            System.out.println("TE MOTIVAMOS A QUE SIGAS VENDIENDO MÁS");
            
        }
        
        else if(total_venta >= 100 && total_venta < 200){
            
            bono_1 = 3;
            comision_1 = (total_venta*bono_1)/100;
            System.out.println("el porcentaje de comision es del: 3%");
            System.out.println("Has recibido un bono de: " + comision_1);
        }
        
        else if(total_venta >= 200 && total_venta < 400){
            
            bono_2 = 6;
            comision_2 = (total_venta*bono_2)/100;
            System.out.println("el porcentaje de comision es del: 6%");

            System.out.println("Has recibido un bono de: " + comision_2);
        }
        
        else if(total_venta >= 400 ){
            
            bono_3 = 10;
            comision_3 = (total_venta*bono_3)/100;
            System.out.println("el porcentaje de comision es del: 10%");

            System.out.println("Has recibido un bono de: " + comision_3);
        }
    }
    
}

