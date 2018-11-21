
package parcialpracticodos.registroperros;

import java.util.ArrayList;
import java.util.Scanner;
public class RegistroPrincipalPerros {
    
    static Perros perro = new Perros();
    static ArrayList<Perros> listaP = new ArrayList<Perros>();
    static String nombreDueño = "", nombrePerro = "", razaPerro = "";
    
    public static void main(String args[]){
        Scanner scannerTextos = new Scanner(System.in); 
        Scanner scannerNumerico = new Scanner(System.in);
        System.out.println(":::BIENVENIDO AL REGISTRO DE PERROS:::" + "\nRELLENE EL SIGUIENTE FOMRULARIO:\n");
       int agregar;
        do{
            perro = new Perros();
            System.out.println("Nombre del perro:");
            perro.setNombrePerro(scannerTextos.nextLine());
            System.out.println("Ingrese raza del perro:");
            perro.setRazaPerro(scannerTextos.nextLine());
            System.out.println("Ingrese altura (metros):");
            perro.setAlturaPerro(scannerNumerico.nextFloat());
            System.out.println("Ingrese peso(Kg) del perro:");
            perro.setPesoPerro(scannerNumerico.nextDouble());
            System.out.println("Nombre del dueño:");
            perro.setNombreDueño(scannerTextos.nextLine());
            listaP.add(perro);
            System.out.println("Seleccione:" + "\n1.CONTINUAR" + "\n0.MOSTRAR LISTA");
            agregar = scannerNumerico.nextInt();
        }while(agregar == 1);
        System.out.println("");
        System.out.println(":::PERRO MÁS ALTO:::\n");
        perroMasAlto();
        System.out.println("");
        System.out.println(":::PERRO MÁS PESADO:::\n");
        perroMasPesado();
    }
    
    public static void perroMasAlto(){
        float perroMasA = 0;
        for (int i = 0; i < listaP.size(); i++) {
            if(listaP.get(i).getAlturaPerro() > perroMasA){
                perroMasA = listaP.get(i).getAlturaPerro();
                nombreDueño = listaP.get(i).getNombreDueño();
                nombrePerro = listaP.get(i).getNombrePerro();
                razaPerro = listaP.get(i).getRazaPerro();
            }
        }
        System.out.println("El perro más alto es: " + nombrePerro + "\nSu dueño es: " + nombreDueño + "\nEs raza: " + razaPerro
        + "\nSu altura es de: " + perroMasA + " mts");
    }
    
    public static void perroMasPesado(){
        double perroMasP = 0;
        for (int i = 0; i < listaP.size(); i++) {
            if(listaP.get(i).getPesoPerro() > perroMasP){
                perroMasP = listaP.get(i).getPesoPerro();
                nombreDueño = listaP.get(i).getNombreDueño();
                nombrePerro = listaP.get(i).getNombrePerro();
                razaPerro = listaP.get(i).getRazaPerro();
            }
        }
        System.out.println("El perro más pesado es: " + nombrePerro + "\nSu dueño es: " + nombreDueño + "\nEs raza: " + razaPerro + "\nSu peso es de: " + perroMasP + " Kg");
    }
}
