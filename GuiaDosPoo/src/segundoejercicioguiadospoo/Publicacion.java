
package segundoejercicioguiadospoo;

public class Publicacion {
    
    private String nombre;
    private String autor;
    private String categoria;
    private int numeroPaginas;
    private int isbn;
    private int fechaPublicacion;

   /* public Publicacion() {
    }*/

    public Publicacion(String nombre, String autor, String categoria, int numeroPaginas, int isbn, int fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    
}
