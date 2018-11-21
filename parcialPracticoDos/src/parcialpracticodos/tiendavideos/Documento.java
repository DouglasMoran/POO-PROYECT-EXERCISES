
package parcialpracticodos.tiendavideos;

public class Documento extends Dvd{

    public Documento(String titulo, String genero, String tipo) {
        super(titulo, genero, tipo);
    }

    public Documento() {
    }
    
    @Override
    public String mostrarDatos(){
        return "Titulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nTipo: " + getTipo();
    }
    
    
}
