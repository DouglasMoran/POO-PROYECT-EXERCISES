
package pooclass4;

import java.util.Scanner;

public class exercises2 {
   
    public static void main(String[] args) {
        
        /*
        Investigue el uso de la clase Math de Java y realice un ejemplo 
        para potencia y raíz cuadrada
        */
        
        //Ejemplo para poder calcular  A - área del cuadrado
        //La fórmula del área del cuadrado a base de la longitud de su diagonal.
        //El área de un cuadrado es la mitad del cuadrado de la longitud de diagonal.
        //a - longitud del lado del cuadro,
        //d - longitud del diagonal del cuadro. 
        //A = 1/2 (d)2
        //--------------------------------------------------
        //pediré al usuario los datos de:
        // a = 2x/t²
        //pedir desplazamiento y tiempo
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Potencia o Raiz cuadradada?");
        String operacion = in.nextLine();
            
        if (operacion.equalsIgnoreCase("Raiz cuadrada")) {
            raizCuadrada();
        } 
        
        else if (operacion.equalsIgnoreCase("Potencia")) {
            potenciacion();
            
        }
    }

    private static void raizCuadrada() {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el valor de: ");
        int raiz = Integer.parseInt(num.nextLine());
        if(raiz>=0){
        double total = (Math.sqrt(raiz));
        System.out.println("Raiz cuadrada de: " + raiz + " es " + total);
        }else {
            System.out.println("No existe!!");
        }
    }

    private static void potenciacion() {
        
        Scanner num = new Scanner(System.in);
        Scanner exponente = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num_1 = num.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int num_2 = exponente.nextInt();
        double total = Math.pow(num_1, num_2);
        System.out.println("La potencia es: " +  total);

    }
    
}
