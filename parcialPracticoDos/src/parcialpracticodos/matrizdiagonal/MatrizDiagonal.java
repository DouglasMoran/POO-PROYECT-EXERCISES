
package parcialpracticodos.matrizdiagonal;

import java.io.IOException;
import java.util.Scanner;

public class MatrizDiagonal {
    
     public static void main(String[] args) throws IOException {
        Scanner scannerNumeros = new Scanner(System.in);
        int matriz[][]; 
        int n, dP = 0; 
         System.out.println(":::MOSTRANDO DIAGONAL PRINCIPAL DE UNA MATRIZ CUADRADA:::\n");
        System.out.println("\n¿Cuál es la dimensión de la matriz?" + "\nIngrese dimensión por favor:");
        n = scannerNumeros.nextInt(); 
        matriz = new int[n][n];  // matriz nxn 
        llenarMatriz(matriz, n); 
        imprimir(matriz,n); 
        //diagonal principal
         System.out.println("");
        System.out.print("La diagonal principal es:    ["); 
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++){ 
                if (i == j) 
                    System.out.print(matriz[i][j] +" "); 
                else if (i < j) dP += matriz[i][j]; 
            } 
        System.out.println("]");
    } 
    // clase ramdom para llenar M = nxn 
    public static void llenarMatriz(int matriz[][], int n){
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++) 
                matriz[i][j] = (int) (Math.random()*2);
    } 

    public static void imprimir(int matriz[][], int n){ 
        System.out.println(); 
        for (int i=0; i<n; i++){ 
            for (int j=0; j<n; j++) 
                System.out.print(matriz[i][j]+" "); 
            System.out.println(); 
        } 
        System.out.println(); 
    }
}
