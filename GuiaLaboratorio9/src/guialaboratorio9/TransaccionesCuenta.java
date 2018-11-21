package guialaboratorio9;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TransaccionesCuenta {

    static Cuenta c = new Cuenta();
    static ArrayList<Cuenta> listaRegistro = new ArrayList<Cuenta>();
    static int continuar;
    static String nCuenta;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JOptionPane.showMessageDialog(null, ":::BIENVENIDO/A AL MEJOR CONTROL DE CUENTAS:::");
        menu();
    }

    public static void menu() throws IOException, ClassNotFoundException {

        int sOperacion = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n1.ABRIR CUENTA" + "\n2.DEPOSITAR"
                + "\n3.RETIRAR" + "\n4.MOSTAR" + "\n5.BUSCAR" + "\n0.CERRAR PROGRAMA"));

        switch (sOperacion) {
            case 1:
                do {
                    abrirCuenta();
                    continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n1.AÑADIR NUEVA CUENTA" + "\n0.VOLVER AL MENú"));
                    if (continuar == 0) {
                        menu();
                    }
                } while (continuar == 1);
                break;

            case 2:
                do {
                    nCuenta = JOptionPane.showInputDialog(null, "Ingrese el número de cuenta al que realizara el deposito:");
                    depositarSaldoCuenta(nCuenta);
                    continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n1.REALIZAR OTRO DEPOSITO" + "\n0.VOLVER AL MENú"));
                    if (continuar == 0) {
                        menu();
                    }
                } while (continuar == 1);
                break;

            case 3:
                do {
                    nCuenta = JOptionPane.showInputDialog(null, "Ingrese el número de cuenta a realizar el retiro:");
                    retirarSaldoCuenta(nCuenta);
                    continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n1.REALIZAR OTRO RETIRO" + "\n0.VOLVER AL MENú"));
                    if (continuar == 0) {
                        menu();
                    }
                } while (continuar == 1);
                break;

            case 4:
                mostarCuentas();
                continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n0.VOLVER AL MENú"));
                if (continuar == 0) {
                    menu();
                }
                break;

            case 5:
                do {
                    buscar(nCuenta);
                    continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE: " + "\n1.REALIZAR OTRA BUSQUEDA" + "\n0.VOLVER AL MENú"));
                    if (continuar == 0) {
                        menu();
                    }
                } while (continuar == 1);
                break;

            case 0:
                System.exit(0);
                JOptionPane.showMessageDialog(null, "GRACIAS POR PREFERIRNOS!!");
                break;
        }
    }

    public static void abrirCuenta() {
        double saldoInicial = 0.01;
        c = new Cuenta();
        do{
            c.setNoCuenta(JOptionPane.showInputDialog(null, "Ingrese número de cuenta:"));
        }while(c.getNoCuenta().equals(""));
        for (Cuenta vc : listaRegistro) {
                while (c.getNoCuenta().equals(vc.getNoCuenta())) {
                    JOptionPane.showMessageDialog(null, "NOTA: LA CUENTA YA EXISTE" + "\nPOR FAVOR DIGITE UNA NUEVA!!");
                    c.setNoCuenta(JOptionPane.showInputDialog(null, "Ingrese número de cuenta:"));
                }
        }
        
        do{
          c.setPropietario(JOptionPane.showInputDialog(null, "Ingrese Nombre propietario:"));
        }while(c.getPropietario().equals(""));
        do{
          c.setDuiPropietario(JOptionPane.showInputDialog(null, "Ingrese DUI propietario:"));
        }while(c.getDuiPropietario().equals(""));
        int saldoIF = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea abrir su cuenta con saldo inicial?" + "\nSeleccione: "
                + "\n1.Sí" + "\n2.No"));
        if (saldoIF == 1) {
            do{
                c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese saldo inicial:")));
                if(c.getSaldo() > 0){
                   JOptionPane.showMessageDialog(null, "SU CUENTA SE HA CREADO EXITOSAMENTE!!"); 
                }
            }while(c.getSaldo() <= 0);
            
        } else if (saldoIF == 2) {
            c.setSaldo(saldoInicial);
            JOptionPane.showMessageDialog(null, "NOTA: SU CUENTA INICIALMENTE SE HA ABIERTO CON UN SALDO DE $0.01 ctvs");
        }
        listaRegistro.add(c);

    }

    public static void depositarSaldoCuenta(String nCuenta) {
        double deposito = 0;
        for (int i = 0; i < listaRegistro.size(); i++) {
            c = new Cuenta();
            if (listaRegistro.get(i).getNoCuenta().equals(nCuenta)) {
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de dinero a depositar: "));
                if (deposito <= 0) {
                    JOptionPane.showMessageDialog(null, "NOTA: No se puede ejecutar dicha transacción");
                } else if (deposito > 0) {
                    listaRegistro.get(i).setSaldo(deposito + listaRegistro.get(i).getSaldo());
                    JOptionPane.showMessageDialog(null, "SU DEPOSITO SE HA REALIZADO EXITOSAMENTE!!");
                }
            }
        }
    }

    public static void retirarSaldoCuenta(String nCuenta) {
        double retiroSaldo = 0;
        for (int i = 0; i < listaRegistro.size(); i++) {
            c = new Cuenta();
            if (listaRegistro.get(i).getNoCuenta().equals(nCuenta)) {
                retiroSaldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de dinero que desea retirar:"));
                if (retiroSaldo > listaRegistro.get(i).getSaldo()) {
                    JOptionPane.showMessageDialog(null, "NOTA: No se puede ejecutar dicha transacción" + "\nSu saldo es inferior al retio solicitado");
                } else if (retiroSaldo <= listaRegistro.get(i).getSaldo()) {
                    listaRegistro.get(i).setSaldo(listaRegistro.get(i).getSaldo() - retiroSaldo);
                    JOptionPane.showMessageDialog(null, "SU RETIRO SE HA EFECTUADO EXITOSAMENTE!!");
                }
            }
        }
    }

    public static void buscar(String nCuenta) throws IOException, ClassNotFoundException {
        String busqueda = "";
        do {
            busqueda = JOptionPane.showInputDialog(null, "Ingrese el número de cuenta O DUI a buscar:");
        } while (busqueda.equals(""));

        for (Cuenta bCuenta : listaRegistro) {
            if (bCuenta.getNoCuenta().equalsIgnoreCase(busqueda) || bCuenta.getDuiPropietario().equalsIgnoreCase(busqueda)) {
                JOptionPane.showMessageDialog(null, "LA CUENTA SE HA ENCONTRADO CORRECTAMENTE:\n" + bCuenta.mostrarDatos(nCuenta));
            }
        }
    }

    public static void mostarCuentas() {
        for (int i = 0; i < listaRegistro.size(); i++) {
            listaRegistro.get(i).mostrarDatos();
        }
    }
}
