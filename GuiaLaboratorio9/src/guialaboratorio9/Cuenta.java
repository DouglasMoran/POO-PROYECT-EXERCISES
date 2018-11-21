
package guialaboratorio9;

import javax.swing.JOptionPane;

public class Cuenta {
    
    private String noCuenta;
    private double saldo;
    private String duiPropietario;
    private String propietario;

    public Cuenta(String noCuenta, double saldo, String duiPropietario, String propietario) {
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.duiPropietario = duiPropietario;
        this.propietario = propietario;
    }

    public Cuenta() {
    }
    
    
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDuiPropietario() {
        return duiPropietario;
    }

    public void setDuiPropietario(String duiPropietario) {
        this.duiPropietario = duiPropietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Número de cuenta: " + getNoCuenta()
        + "\nSaldo: " + " $" + getSaldo() + "\nPropietario: " + getPropietario());
    }
    
    public String mostrarDatos(String noCuenta){
        return "Cuenta número: " + getNoCuenta() + "\nCuenta con un saldo de: " +  " $" + getSaldo()
                + "\nPropietario es: " + getPropietario();
    }
    
}
