
package sv.edu.udb.www.guialaboratorioocho;

public class EquipoFutbol extends EquipoDeportivo {

    public EquipoFutbol(String nombreEquipo) {
        super(nombreEquipo);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String mostrarDatos(){
        String datos = "Nombre del Equipo: " + getNombreEquipo() + "\nLista Jugadores: " + getListaJugadores();
        return datos;
    }
    
    
}
