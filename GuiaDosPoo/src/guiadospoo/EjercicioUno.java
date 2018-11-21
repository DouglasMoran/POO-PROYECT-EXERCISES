
package guiadospoo;

import java.util.Scanner;
public class EjercicioUno {
    public static void main(String args[]){
        //leer datos
        Scanner scannerStrings = new Scanner(System.in);
        Scanner scannerNumeros = new Scanner(System.in);
        int i, j;
        double suma =0, mayor;

        System.out.println("Ingrese la cantidad de alumnos que registrara: ");
        int cantidadAlumnos = scannerNumeros.nextInt();
        //Creando objeto de la clase alumno
        Alumnos alumno[] = new Alumnos[cantidadAlumnos];
        
        String nombreA[] = new String[cantidadAlumnos];
        Double notasA[][] = new Double[cantidadAlumnos][3];
        boolean estadoAm[] = new boolean[cantidadAlumnos];
        
        boolean aprobado = true;
        boolean reprobado = false;
        
        double  max[] = new double[cantidadAlumnos];
        double  min[] = new double[cantidadAlumnos];
        double promedio[] = new double[cantidadAlumnos];
        
        for ( i=0; i < notasA.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            nombreA[i] = scannerStrings.nextLine();
            suma = 0;
        for ( j=0; j < notasA[i].length; j++) {
          System.out.println("Ingrese la nota " + (j+1));
          notasA[i][j] = scannerNumeros.nextDouble();
          
            suma = suma + notasA[i][j];
            promedio[i] = suma /3;
            if(promedio[i] > 6){
                estadoAm[i] = aprobado;
            }
            else if(promedio[i] < 6){
                estadoAm[i] = reprobado;
            }
            
            if (min[i] != 0 && max[i] != 0) {
            if (notasA[i][j] > max[i]) {
                max[i] = notasA[i][j];
            }
            if (notasA[i][j] < min[i]) {
                min[i] = notasA[i][j];
            }
        } else {
            min[i] = notasA[i][j];
            max[i] = notasA[i][j];
        }
          if(notasA[i][j] < 0 || notasA[i][j] > 10){
              System.out.println("NO SE PUEDE REGISTRAR LA NOTA!");
              System.out.println("NOTA: Asegurese de utilizar valores positivos ( notas > 0)");
              while(notasA[i][j] < 0 || notasA[i][j] > 10){
                System.out.println("Ingrese la nota " + (j+1));
                notasA[i][j] = scannerNumeros.nextDouble();
              } 
          }
        }
      }
        
        for ( i=0; i < notasA.length; i++) {
            System.out.println("Alumno: " + nombreA[i]);
        for (j=0; j < notasA[i].length; j++) {
            System.out.println("Nota" + (j+1) +  " : " + notasA[i][j] + "\t"); 
        }
            System.out.println("Promedio de "+ nombreA[i]+ ": "+ promedio[i] + "\n");
            System.out.println("El valor menor es: " + min[i]);
            System.out.println("El valor max es: " + max[i]);
            System.out.println("Materia: " + estadoAm[i] + "\n");
      }  
    }
}
