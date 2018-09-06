
package pooclass4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercises3 {
    
    public static void main(String args []){
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        Crear una aplicación que permita concatenar los nombres de varios estudiantes.
        El ingreso de datos debe ser mediante ingreso de datos gráfico (JOptionPane.showInputDialog)
        y el resultado debe mostrarse concatenado (Todos los nombres juntos) en un 
        mensaje gráfico (showMessegeDialog)
        */
  
        String cantidad=JOptionPane.showInputDialog("Ingrese cantidad de nombres: ");
    int j=Integer.parseInt(cantidad);
    String nombres[] = new String[j];


    for(int i=0; i < j; i++){

    nombres[i] = JOptionPane.showInputDialog("Dar un nombre ");

    
    }
    
    String cadena = "";
    
    for(int i=0; i < j; i++){

        cadena += nombres[i]+" \n";
        
    
    }
    
     JOptionPane.showMessageDialog(null, "Los nombres que has guardado son:\n" + cadena);
        
        
    }
    
    public static String guardoNombres(String nombre){
        return nombre;
        
        
       
    }
    
    
    
}
