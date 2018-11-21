
package sv.edu.udb.www.guialaboratorioocho;

import javax.swing.JOptionPane;

public class GuiaLaboratorio8 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int retorno = 0;
        String nombreJugador = "";
        String nombreEquipo = "";
        
        int registroEquipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione equipo ha registrar:"
        + "\n1.Equipo Futbol" + "\n2.Equipo Volleyball" + "\n3.Equipo Basketball"));
        
        switch(registroEquipo){
            case 1:
                do{
                   nombreEquipo = JOptionPane.showInputDialog(null, "Nombre de Equipo: " ); 
                }while(nombreEquipo.equals(""));
                EquipoFutbol futbol = new EquipoFutbol(nombreEquipo);
                
                do{
                    do{
                        nombreJugador = JOptionPane.showInputDialog(null, "Nombre de Jugador: ");
                    }while(nombreJugador.equals(""));
                futbol.getListaJugadores().add(nombreJugador);
                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar otro jugador?" 
                        + "\n1. sí" + "\n2. No"));

                if(retorno <= 0 || retorno > 2){
                    JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                    menu();
                }
                }while(retorno == 1);

                JOptionPane.showMessageDialog(null, futbol.mostrarDatos());
                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione:" 
                        + "\n0. Regresar al menú"));
                if(retorno == 0){
                    menu();
                }
                break;
                
            case 2:
                do{
                   nombreEquipo = JOptionPane.showInputDialog(null, "Nombre de Equipo: " ); 
                }while(nombreEquipo.equals(""));
                EquipoVolleyball volleyball = new EquipoVolleyball(nombreEquipo);
                
                do{
                    do{
                        nombreJugador = JOptionPane.showInputDialog(null, "Nombre de Jugador: ");
                    }while(nombreJugador.equals(""));
                volleyball.getListaJugadores().add(nombreJugador);

                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar otro jugador?" 
                        + "\n1. sí" + "\n2. No"));

                if(retorno <= 0 || retorno > 2){
                    JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                    menu();
                }

                }while(retorno == 1);

                JOptionPane.showMessageDialog(null, volleyball.mostrarDatos());
                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione:" 
                        + "\n0. Regresar al menú"));
                if(retorno == 0){
                    menu();
                }
                break;
                
            case 3:
                do{
                   nombreEquipo = JOptionPane.showInputDialog(null, "Nombre de Equipo: " ); 
                }while(nombreEquipo.equals(""));
                EquipoBasketball basketball = new EquipoBasketball(nombreEquipo);
                
                do{
                    do{
                       nombreJugador = JOptionPane.showInputDialog(null, "Nombre de Jugador: "); 
                    }while(nombreJugador.equals(""));
                
                basketball.getListaJugadores().add(nombreJugador);

                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar otro jugador?" 
                        + "\n1. sí" + "\n2. No"));

                if(retorno <= 0 || retorno > 2){
                    JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                    menu();
                }
                }while(retorno == 1);

                JOptionPane.showMessageDialog(null, basketball.mostrarDatos());
                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione:" 
                        + "\n0. Regresar al menú"));
                if(retorno == 0){
                    menu();
                }
                break;    
        }
    }
}
