
package sv.edu.udb.www.ejerciciounodosguiaocho;

public class Autobus implements Vehiculo{
    
    int capacidadDePie;
    int capacidadSentados;
    double capacidadKilogramos;
    String compañia;

    public int getCapacidadDePie() {
        return capacidadDePie;
    }

    public void setCapacidadDePie(int capacidadDePie) {
        this.capacidadDePie = capacidadDePie;
    }

    public int getCapacidadSentados() {
        return capacidadSentados;
    }

    public void setCapacidadSentados(int capacidadSentados) {
        this.capacidadSentados = capacidadSentados;
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
    public String mostrarCompañia(){
        String nombreCompañia = "Nombre de la compañia es: " + getCompañia();
        return nombreCompañia;
    }
    
    @Override
    public void mostrarCapacidadKilogramos() {
        String capacidadPeso = "Capacidad de kilogramos a soportar es de: " + getCapacidadKilogramos();
        System.out.println(capacidadPeso);
    }

    @Override
    public void mostrarCapacidadPersonas() {
        String capacidadPersonas = "La capacidad de personas es de: " + (getCapacidadDePie() + getCapacidadSentados());
        System.out.println(capacidadPersonas);
    }
    
    
}
