
package sv.edu.udb.www.ejerciciounodosguiaocho;

public class Avion implements Vehiculo{
    
    int numeroAsientos;
    double capacidadKilogramos;
    String compañia;

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getCapacidadKilogramos() {
        return capacidadKilogramos;
    }

    public void setCapacidadKilogramos(double capacidadKilogramos) {
        this.capacidadKilogramos = capacidadKilogramos;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void mostrarCapacidadPersonas() {
        String capacidadPersonas = "La capacidad de personas es de: " + getNumeroAsientos();
        System.out.println(capacidadPersonas);
        
    }

    @Override
    public void mostrarCapacidadKilogramos() {
        String capacidadPeso = "Capacidad de kilogramos a soportar es de: " + getCapacidadKilogramos();
        System.out.println(capacidadPeso);
    }

    @Override
    public String mostrarCompañia() {
        String nombreCompañia = "Nombre de la compañia es: " + getCompañia();
        return nombreCompañia;
    }
    
    
    
}
