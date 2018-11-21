
package segundoejercicioguiadospoo;

public class Peliculas {
    
    private String titulo;
    private String creador;
    private int duracion;
    private String descripción;
    private String clasificacion;

    public Peliculas(String titulo, String creador, int duracion, String descripción, String clasificacion) {
        this.titulo = titulo;
        this.creador = creador;
        this.duracion = duracion;
        this.descripción = descripción;
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    
}
