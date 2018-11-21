/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejercicioguiadospoo;

import com.sun.prism.impl.PrismSettings;
import javax.swing.JOptionPane;

public class Libros extends Publicacion{
    
    private int tomo;
    private String editorial;

    public Libros(String nombre, String autor, String categoria, int numeroPaginas, int isbn, int fechaPublicacion, int tomo, String editorial) {
        super(nombre, autor, categoria, numeroPaginas, isbn, fechaPublicacion);
        this.tomo = tomo;
        this.editorial = editorial;
    }

    public int getTomo() {
        return tomo;
    }

    public void setTomo(int tomo) {
        this.tomo = tomo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public String mostrarDatosLibro(){
        
        return "Nombre: " + getNombre()
                    + " \n" +
                    "Autor: " + getAutor()
                    + " \n" +
                    "Categoria: " + getCategoria()
                    + " \n" +       
                    "Número de páginas: " + getNumeroPaginas()
                    + " \n " +
                    "ISBN: " + getIsbn()
                    + " \n " +
                    "Fecha de publicación: " + getFechaPublicacion()
                    + " \n " +
                    "Tomo: " + getTomo()
                    + " \n " +
                    "Editorial: " + getEditorial();
    }
    
}
