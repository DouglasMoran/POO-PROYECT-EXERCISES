
package parcialpracticodos.tiendavideos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroTiendaMultimedia {
    static Peliculas p = new Peliculas();
    static Series s = new Series();
    static Juegos j = new Juegos();
    static Documento d = new Documento();
    static ArrayList<Dvd> listaRegistros = new ArrayList<Dvd>();
    
    public static void main(String args[]){
        menu();
    }
    
    public static void menu(){
        String actores, capitulos, elenco;
        int retorno, cAgregacion;
        int sM = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea registrar?\n" + "Seleccione: " 
                + "\n1.PELICULAS" + "\n2.SERIES" + "\n3.JUEGOS" + "\n4.Documentos" +  "\n0.SALIR"));
        
        switch(sM){
            case 1:
                    do{
                        JOptionPane.showMessageDialog(null, "RELLENE EL SIGUIENTE FORMULARIO!!");
                    p = new Peliculas();
                    p.setTitulo(JOptionPane.showInputDialog(null, "Titulo:"));
                    p.setGenero(JOptionPane.showInputDialog(null, "Genero:"));
                    p.setTipo(JOptionPane.showInputDialog(null, "Tipo:"));
                    do{
                            do{
                                actores = JOptionPane.showInputDialog(null, "Actores de la pelicula:");
                            }while(actores.equals(""));
                        p.getListaActores().add(actores);
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Para agregar otro actor seleccione:" 
                                + "\n1. sí" + "\n2. No"));

                        if(retorno <= 0 || retorno > 2){
                            JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                            menu();
                        }
                        }while(retorno == 1);
                    p.setDuracion(Float.parseFloat(JOptionPane.showInputDialog(null, "Duracion:")));
                    listaRegistros.add(p);
                    cAgregacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione::" 
                                    + "\n1. CONTINUAR REGISTRANDO" + "\n2.MOSTRAR LOS REGISTROS INGRESADOS" +  "\n0. VOLVER AL MENU PRINCIPAL"));
                        
                    if(cAgregacion == 2){
                        JOptionPane.showMessageDialog(null, "LAS DVD'S EN REGISTRO SON:\n");
                        mostrarListaDvs();
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione: " + "\n0.VOLVER AL MENU PRINCIPAL"));
                        if(retorno == 0){
                            menu();
                        }
                    }
                    else if(cAgregacion == 0){
                            menu();
                        }
                    }while(cAgregacion == 1);
                break;
                
            case 2:
                do{
                    JOptionPane.showMessageDialog(null, "RELLENE EL SIGUIENTE FORMULARIO!!");
                    s = new Series();
                    s.setTitulo(JOptionPane.showInputDialog(null, "Titulo:"));
                    s.setGenero(JOptionPane.showInputDialog(null, "Genero:"));
                    s.setTipo(JOptionPane.showInputDialog(null, "Tipo:"));
                    do{
                            do{
                                capitulos = JOptionPane.showInputDialog(null, "Capitulos de la serie:");
                            }while(capitulos.equals(""));
                        s.getListaCapitulos().add(capitulos);
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Para agregar otro capitulo seleccione:" 
                                + "\n1. sí" + "\n2. No"));

                        if(retorno <= 0 || retorno > 2){
                            JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                            menu();
                        }
                        }while(retorno == 1);
                    do{
                            do{
                                elenco = JOptionPane.showInputDialog(null, "Elenco:");
                                //capitulos = JOptionPane.showInputDialog(null, "Capitulos de la serie:");
                            }while(elenco.equals(""));
                        s.getListaElenco().add(elenco);
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Para agregar otro miembro seleccione:" 
                                + "\n1. sí" + "\n2. No"));
                        if(retorno <= 0 || retorno > 2){
                            JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                            menu();
                        }
                        }while(retorno == 1);
                    listaRegistros.add(s);
                    cAgregacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione::" 
                                    + "\n1. CONTINUAR REGISTRANDO" + "\n2.MOSTRAR LOS REGISTROS INGRESADOS" +  "\n0. VOLVER AL MENU PRINCIPAL"));
                        
                    if(cAgregacion == 2){
                        JOptionPane.showMessageDialog(null, "LAS DVD'S EN REGISTRO SON:\n");
                        mostrarListaDvs();
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione: " + "\n0.VOLVER AL MENU PRINCIPAL"));
                        if(retorno == 0){
                            menu();
                        }
                    }
                    else if(cAgregacion == 0){
                            menu();
                        }
                    }while(cAgregacion == 1);
                break;
                
            case 3:
                do{
                    JOptionPane.showMessageDialog(null, "RELLENE EL SIGUIENTE FORMULARIO!!");
                    j = new Juegos();
                    j.setTitulo(JOptionPane.showInputDialog(null, "Titulo:"));
                    j.setGenero(JOptionPane.showInputDialog(null, "Genero:"));
                    j.setTipo(JOptionPane.showInputDialog(null, "Tipo:"));
                    j.setPlataforma(JOptionPane.showInputDialog(null, "Plataforma:"));
                    listaRegistros.add(j);
                    cAgregacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione::" 
                                    + "\n1. CONTINUAR REGISTRANDO" + "\n2.MOSTRAR LOS REGISTROS INGRESADOS" +  "\n0. VOLVER AL MENU PRINCIPAL"));
                        
                    if(cAgregacion == 2){
                        JOptionPane.showMessageDialog(null, "LOS DVD'S EN REGISTRO SON:\n");
                        mostrarListaDvs();
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione: " + "\n0.VOLVER AL MENU PRINCIPAL"));
                        if(retorno == 0){
                            menu();
                        }
                    }
                    else if(cAgregacion == 0){
                            menu();
                        }
                    }while(cAgregacion == 1);
                break;
            
            
            case 4:
                    do{
                    d = new Documento();
                    d.setTitulo(JOptionPane.showInputDialog(null, "Titulo:"));
                    d.setGenero(JOptionPane.showInputDialog(null, "Genero:"));
                    d.setTipo(JOptionPane.showInputDialog(null, "Tipo:"));
                    listaRegistros.add(d);
                    cAgregacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione::" 
                                    + "\n1. CONTINUAR REGISTRANDO" + "\n2.MOSTRAR LOS REGISTROS INGRESADOS" +  "\n0. VOLVER AL MENU PRINCIPAL"));
                        
                    if(cAgregacion == 2){
                        JOptionPane.showMessageDialog(null, "LOS DVD'S EN REGISTRO SON:\n");
                        mostrarListaDvs();
                        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione: " + "\n0.VOLVER AL MENU PRINCIPAL"));
                        if(retorno == 0){
                            menu();
                        }
                    }
                    else if(cAgregacion == 0){
                            menu();
                        }
                    }while(cAgregacion == 1);
                break;
                
            case 0:
                System.exit(0);
                break;
        }
    }
    
    public static void mostrarListaDvs(){
        for(Dvd lDvd: listaRegistros){
            JOptionPane.showMessageDialog(null, lDvd.mostrarDatos());
        }
    }
}
