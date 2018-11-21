
package guiadospoo;

public class Alumnos {
    
    String nombre;
    double nota;
    boolean estado;

    public Alumnos() {
    }
    
    public String mostrarDatos(){
    
        String datos = "Nombre: " + this.nombre + "\nNota: " + this.nota + "\nEstado: " + this.estado;  
        
        return datos;
    
    }
    
}
