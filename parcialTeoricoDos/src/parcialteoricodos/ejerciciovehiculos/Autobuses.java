
package parcialteoricodos.ejerciciovehiculos;

import parcialteoricodos.ejerciciovehiculos.Vehiculos;

public class Autobuses extends Vehiculos{
    private float numeroPlazas;

    public Autobuses(float numeroPlazas, String matricula, String modelo, float potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    public float getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(float numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
