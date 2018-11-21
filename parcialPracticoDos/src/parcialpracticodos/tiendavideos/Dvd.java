 
package parcialpracticodos.tiendavideos;

public abstract class Dvd {
    private String titulo;
    private String genero;
    private String tipo;
    
    public Dvd(String titulo, String genero, String tipo) {
        this.titulo = titulo;
        this.genero = genero;
        this.tipo = tipo;
    }

    public Dvd() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract String mostrarDatos();
}

