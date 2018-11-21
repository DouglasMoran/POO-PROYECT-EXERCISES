
package segundoejercicioguiadospoo;

public class Videos  extends Peliculas{

    public Videos(String titulo, String creador, int duracion, String descripción, String clasificacion) {
        super(titulo, creador, duracion, descripción, clasificacion);
    }
    
    /**/
    
    public String datosVideo(){
        
        return "Titulo: " + getTitulo()
                    + " \n" +
                    "Creador: " + getCreador()
                    + " \n" +
                    "Duración: " + getDuracion()
                    + " \n " +
                    "Descripción: " + getDescripción()
                    + " \n " +
                    "Clasificación: " + getClasificacion()
                    + "\n-------------------------------------------";
    }
    
    
}
