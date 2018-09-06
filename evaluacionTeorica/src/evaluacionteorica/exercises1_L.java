
package evaluacionteorica;

import java.util.Scanner;

public class exercises1_L {
    
    public static void main(String args []){
        /*Crear un programa que permita conocer el promedio global de las notas
        de n alumnos, debe permitir ingresar únicamente notas validas desde
        0.0 hasta 10.0*/
        Scanner scanner = new Scanner(System.in);
        
        double nota,promedioN,notaP,notaS;
        int cAlumnos;
        nota = 0;
        notaS = 0;
        
        System.out.println("Ingrese cantidad de alumnos:");
        cAlumnos = scanner.nextInt();
        
        for(int i = 1; i <= cAlumnos; i++){
            System.out.println("\nIngrese nota " + i + " : ");
            nota = scanner.nextDouble();
            
            if(nota < 0 || nota > 10){
                do{
                    System.out.println("Ingrese nota " + i + " : ");
                    nota = scanner.nextDouble();
                }while(nota < 0 || nota > 10 );
            }else{
                
            }
            
            notaS = notaS + nota;
        }
        
        notaP = (notaS)/cAlumnos;
        System.out.println("\nEl promedio de las notas es de: " + notaP);
        
    }
    
}
