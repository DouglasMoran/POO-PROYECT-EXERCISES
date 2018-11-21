
package parcialteoricodos.ejerciciovehiculos;

import parcialteoricodos.ejerciciovehiculos.Vehiculos;

public class Taxis extends Vehiculos{
    private int numeroLicencia;

    public Taxis(int numeroLicencia, String matricula, String modelo, float potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
