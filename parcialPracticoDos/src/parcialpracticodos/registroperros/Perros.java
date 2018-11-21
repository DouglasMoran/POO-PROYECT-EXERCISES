
package parcialpracticodos.registroperros;

public class Perros {
    
    private String nombrePerro;
    private String nombreDueño;
    private String razaPerro;
    private float alturaPerro;
    private double pesoPerro;

    public Perros(String nombrePerro, String nombreDueño, String razaPerro, float alturaPerro, double pesoPerro) {
        this.nombrePerro = nombrePerro;
        this.nombreDueño = nombreDueño;
        this.razaPerro = razaPerro;
        this.alturaPerro = alturaPerro;
        this.pesoPerro = pesoPerro;
    }
    
    public Perros() {
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public float getAlturaPerro() {
        return alturaPerro;
    }

    public void setAlturaPerro(float alturaPerro) {
        this.alturaPerro = alturaPerro;
    }

    public double getPesoPerro() {
        return pesoPerro;
    }

    public void setPesoPerro(double pesoPerro) {
        this.pesoPerro = pesoPerro;
    }
    
}
