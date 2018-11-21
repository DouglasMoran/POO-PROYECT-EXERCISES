
package guialaboratorio7;

import java.util.ArrayList;
import java.util.Scanner;

public class complementario1 {
    
    public static void main(String args[]){
        
    ArrayList<Taxis> registrosTaxis = new ArrayList();
    ArrayList<Autobuses> registroAutobuses = new ArrayList();
    
    Scanner scannerStrings = new Scanner(System.in);
    Scanner scannerNumeros = new Scanner(System.in);
    
    Taxis taxiRegistrado;
    Autobuses autobusRegistrado;
    
    String salir= "Si";
    int opcion = 0;
    
    /*do{*/    
    for (int i = 0; i < 2; i++) {
        System.out.println(":::INGRESE DATOS:::\n");
                System.out.println("Ingrese la matricula: ");
                String matricula = scannerStrings.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = scannerStrings.nextLine();
                System.out.println("Ingrese la potencia: ");
                float potenciaCV = scannerNumeros.nextFloat();
                
        System.out.println(":::¿QUÉ DESEA REGISTRAR?:::: \n");
        System.out.println("1. Taxi\n" + "2. Autobus");
        int eleccionRegistro = scannerNumeros.nextInt();        
        
        switch(eleccionRegistro){
            case 1:
                System.out.println("Ingrese el número de licencia: ");
                int numeroLicencia = scannerNumeros.nextInt();
                
                taxiRegistrado = new Taxis(numeroLicencia, matricula, modelo, potenciaCV);
                registrosTaxis.add(taxiRegistrado);
                break;
                   
            case 2:
                System.out.println("Ingrese el número de plazas: ");
                int numeroPlazas = scannerNumeros.nextInt();
                
                autobusRegistrado = new Autobuses(numeroPlazas, matricula, modelo, potenciaCV);
                registroAutobuses.add(autobusRegistrado);
                break;
        };
        
        /*System.out.println("Desea salir?");
			salir = scannerStrings.next();*/
        }
        /*}while(!salir.equals("Si"));*/
        
        
        for (Taxis registroTaxi : registrosTaxis) {
            System.out.println("\t:::TAXI REGISTRADO::: ");
            System.out.println(
                    
                   "Matricula: " +  registroTaxi.getMatricula()
                    + " \n" +
                    "Modelo: " + registroTaxi.getModelo()
                    + " \n" +
                    "Potencia: " + registroTaxi.getPotenciaCV()
                    + " \n" + 
                    "Número Licencia: " + registroTaxi.getNumeroLicencia()
            );
        }
    
    
        
        for (Autobuses registroAutobuse : registroAutobuses) {
            System.out.println("\t:::AUTOBUS REGISTRADO::: ");
            System.out.println(
                    
                   "Matricula: " +  registroAutobuse.getMatricula()
                    + " \n" +
                    "Modelo: " + registroAutobuse.getModelo()
                    + " \n" +
                    "Potencia: " + registroAutobuse.getPotenciaCV()
                    + " \n" + 
                    "Plazas: " + registroAutobuse.getNumeroPlazas()
            );
            
        }
    }
    
}
    
