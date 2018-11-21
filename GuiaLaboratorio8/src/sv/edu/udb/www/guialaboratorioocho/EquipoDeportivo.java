
package sv.edu.udb.www.guialaboratorioocho;

import java.util.ArrayList;

public abstract class EquipoDeportivo {
    
    private String nombreEquipo;
    private ArrayList<String> listaJugadores = new ArrayList<String>();
    
    public EquipoDeportivo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<String> getListaJugadores() {
        return listaJugadores;
    }
    
    public abstract String mostrarDatos();
    
}
