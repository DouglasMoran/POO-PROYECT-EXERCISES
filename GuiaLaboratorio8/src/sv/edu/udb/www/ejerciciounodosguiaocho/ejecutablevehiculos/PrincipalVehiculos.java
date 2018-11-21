
package sv.edu.udb.www.ejerciciounodosguiaocho.ejecutablevehiculos;

import java.util.ArrayList;
import java.util.Scanner;
import sv.edu.udb.www.ejerciciounodosguiaocho.Autobus;
import sv.edu.udb.www.ejerciciounodosguiaocho.Avion;
import sv.edu.udb.www.ejerciciounodosguiaocho.Vehiculo;

public class PrincipalVehiculos {
    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    public static void main(String args[]){
        menu();
    }
    
    
    public static void menu(){
        Scanner scannerTexto = new Scanner(System.in);
        Scanner scannerNumeros = new Scanner(System.in);
        int cVehiculos;
        
        System.out.println("Que tipo de vehiculo desea agregar:" +
                "\n1.Autobus" + "\n2.Avión");
        int seleccionVehiculo = scannerNumeros.nextInt();
        
        switch(seleccionVehiculo){
            case 1:
                System.out.println("Ingrese cantidad de vehiculos que desea agregar: ");
                cVehiculos = scannerNumeros.nextInt();
                for (int i = 0; i < cVehiculos; i++) {
                    Autobus autobus = new Autobus();
                    System.out.println("Ingrese capacidad de personas de pie:");
                    autobus.setCapacidadDePie(scannerNumeros.nextInt());
                    System.out.println("Ingrese capacidad de personas sentadas:");
                    autobus.setCapacidadSentados(scannerNumeros.nextInt());
                    System.out.println("Ingrese capacidad de kilogramos soportados:");
                    autobus.setCapacidadKilogramos(scannerNumeros.nextDouble());
                    System.out.println("Ingrese nombre de la compañia:");
                    autobus.setCompañia(scannerTexto.nextLine());
                    listaVehiculos.add(autobus);
                }
                break;
                
            case 2:
                System.out.println("Ingrese cantidad de vehiculos que desea agregar: ");
                cVehiculos = scannerNumeros.nextInt();
                for (int i = 0; i < cVehiculos; i++) {
                    Avion avion = new Avion();
                    System.out.println("Ingrese número de asientos:");
                    avion.setNumeroAsientos(scannerNumeros.nextInt());
                    System.out.println("Ingrese capacidad de kilogramos soportados:");
                    avion.setCapacidadKilogramos(scannerNumeros.nextDouble());
                    System.out.println("Ingrese nombre de la compañia:");
                    avion.setCompañia(scannerTexto.nextLine());
                    listaVehiculos.add(avion);
                }
                break;     
        }
        
        System.out.println("Presione:" + "\n0.regresar al menu" + "\n1.Mostrar datos de los registros ingresados");
                int retornarMenu = scannerNumeros.nextInt();
                if(retornarMenu == 0){
                   menu(); 
                }else if(retornarMenu == 1){
                   mostrarListaVehiculos();
                    System.out.println("Seleccione: " + "\n1.Volver al menu principal" + "\n2.cerrar programa");
                    int opcion = scannerNumeros.nextInt();
                    if(opcion == 1){
                        menu();
                    }else if(opcion == 2){
                        System.exit(0);
                    }
                }
    }
    
    public static void mostrarListaVehiculos(){
        for(Vehiculo listaVehiculos: listaVehiculos){
            System.out.println(listaVehiculos.mostrarCompañia());
            listaVehiculos.mostrarCapacidadPersonas();
            listaVehiculos.mostrarCapacidadKilogramos();
        }
        
    }
    
}
