
package parcialpracticodos.tiendavideos;

import java.util.ArrayList;

public class Peliculas extends Dvd{
    private float duracion;
    private ArrayList<String> listaActores = new ArrayList<String>();

    public Peliculas(float duracion, String titulo, String genero, String tipo) {
        super(titulo, genero, tipo);
        this.duracion = duracion;
    }
   
    public Peliculas() {
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getListaActores() {
        return listaActores;
    }

    public void setListaActores(ArrayList<String> listaActores) {
        this.listaActores = listaActores;
    }
    
    @Override
    public String mostrarDatos(){
        return "Titulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nTipo: " + getTipo()
                + "\nActores: " + getListaActores()  + "\nDuración: " + getDuracion();
    }
}
