
package parcialpracticodos.tiendavideos;

public class Juegos extends Dvd{
    
    private String plataforma;

    public Juegos(String plataforma, String titulo, String genero, String tipo) {
        super(titulo, genero, tipo);
        this.plataforma = plataforma;
    }

    public Juegos() {
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    @Override
    public String mostrarDatos(){
        return "Titulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nTipo: " + getTipo() 
                + "\nPlataforma: " + getPlataforma();
    }
}
