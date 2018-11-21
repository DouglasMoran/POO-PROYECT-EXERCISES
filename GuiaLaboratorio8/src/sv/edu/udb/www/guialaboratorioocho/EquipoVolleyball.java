
package sv.edu.udb.www.guialaboratorioocho;

public class EquipoVolleyball extends EquipoDeportivo {

    public EquipoVolleyball(String nombreEquipo) {
        super(nombreEquipo);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String mostrarDatos(){
        String datosEV = "Nombre del equipo: " + getNombreEquipo() +  "\nLista Jugadores: " + getListaJugadores();
        return datosEV;
    }
}
