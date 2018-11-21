
package parcialpracticodos.tiendavideos;

import java.util.ArrayList;

public class Series extends Dvd{
    
    private String elenco;
    private ArrayList<String> listaCapitulos = new ArrayList<String>();
    private ArrayList<String> listaElenco = new ArrayList<String>();

    public Series(String elenco, String titulo, String genero, String tipo) {
        super(titulo, genero, tipo);
        this.elenco = elenco;
    }

    public Series() {
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public ArrayList<String> getListaCapitulos() {
        return listaCapitulos;
    }

    public ArrayList<String> getListaElenco() {
        return listaElenco;
    }
    
    @Override
    public String mostrarDatos(){
        return "Titulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nTipo: " + getTipo() 
                + "\nCapitulos: " + getListaCapitulos() + "\nElenco " + getListaElenco();
    }
}
