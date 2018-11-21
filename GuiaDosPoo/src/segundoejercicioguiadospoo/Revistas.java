
package segundoejercicioguiadospoo;

public class Revistas extends Publicacion{

    public Revistas(String nombre, String autor, String categoria, int numeroPaginas, int isbn, int fechaPublicacion) {
        super(nombre, autor, categoria, numeroPaginas, isbn, fechaPublicacion);
    }

    

   
    public String datosRevistas(){
        
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
                    "Fecha de publicación: " + getFechaPublicacion();
    }
    
    
    
    
}
