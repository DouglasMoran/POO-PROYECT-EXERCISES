
package sv.edu.udb.www.guialaboratorioocho;

public class EquipoBasketball extends EquipoDeportivo{

    public EquipoBasketball(String nombreEquipo) {
        super(nombreEquipo);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String mostrarDatos(){
        String datosEB = "Nombre del equipo: " + getNombreEquipo() +  "\nLista Jugadores: " + getListaJugadores();
        return datosEB;
    }
}
