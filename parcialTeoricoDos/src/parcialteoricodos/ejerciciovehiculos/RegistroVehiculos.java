
package parcialteoricodos.ejerciciovehiculos;
import parcialteoricodos.ejerciciovehiculos.Autobuses;
import parcialteoricodos.ejerciciovehiculos.Taxis;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroVehiculos {
static ArrayList<Taxis> listaTaxis = new ArrayList<>();
static ArrayList<Autobuses> listaAutobuses = new ArrayList<>();
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al registro Vehicular");
        JOptionPane.showMessageDialog(null, "Los datos de los taxis registrados son: ");
        registrosTaxis();
        mostrarListaTaxis();
        JOptionPane.showMessageDialog(null, "Los datos de autobuses registrados son: ");
        registrosAutobuses();
        mostrarListaAutobuses();
        JOptionPane.showMessageDialog(null, "Gracias por hacer uso de nuestra aplicación!!");
    }
    
    public static void registrosTaxis(){
       Taxis listaTaxisR;
       listaTaxisR = new Taxis(7894-5876-4852, "151512", "Convertible", 2000);
       listaTaxis.add(listaTaxisR);
       listaTaxisR = new Taxis(1230564, "POO799401", "Deportivo", 5000);
       listaTaxis.add(listaTaxisR);
       listaTaxisR = new Taxis(0710520, "ZXCVBN2015", "Ejecutivo", 4000);
       listaTaxis.add(listaTaxisR);
    }
    
    public static void mostrarListaTaxis(){
        for (Taxis listaTaxi : listaTaxis) {
            JOptionPane.showMessageDialog(null, "Número licencia: " + listaTaxi.getNumeroLicencia()
            + "\nMatricula: " + listaTaxi.getMatricula() + "\nModelo: " + listaTaxi.getModelo() + "\nPotencia: " + listaTaxi.getPotenciaCV());
        }
    }
    
    public static void registrosAutobuses(){
        Autobuses listaAutobusesR;
        listaAutobusesR = new Autobuses(5, "789456", "Pick-up", 6000);
        listaAutobuses.add(listaAutobusesR);
        listaAutobusesR = new Autobuses(4, "7852001", "Sedan", 4000);
        listaAutobuses.add(listaAutobusesR);
        listaAutobusesR = new Autobuses(6, "7963014", "Camioneta", 3000);
        listaAutobuses.add(listaAutobusesR);
    }
    
    public static void mostrarListaAutobuses(){
        for (Autobuses listaaAutobus : listaAutobuses) {
            JOptionPane.showMessageDialog(null, "Número licencia: " + listaaAutobus.getNumeroPlazas()
            + "\nMatricula: " + listaaAutobus.getMatricula() + "\nModelo: " + listaaAutobus.getModelo() + "\nPotencia: " + listaaAutobus.getPotenciaCV());
        }
    }
     
}
