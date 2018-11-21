package segundoejercicioguiadospoo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioDosPoo {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        menuBiblioteca();
    }
    
    public static void menuBiblioteca() throws IOException, ClassNotFoundException {
        
       Biblioteca biblioteca = new Biblioteca();
       boolean v_menu = false; 
       
        int MenuReturn;
        int inM = Integer.parseInt(JOptionPane.showInputDialog(null, "******* ¿A DÓNDE QUIERES IR? *******\n" +
                "1.LIBROS" + "\n2.REVISTAS" + "\n3.TESIS" + "\n4.VIDEOS" + "\n5.SALIR"));
        
        switch(inM){
            case 1:
                int mAcL = Integer.parseInt(JOptionPane.showInputDialog(null, "::: ¿QUÉ DESEAS HACER? :::\n" +
                        "1. - VER LIBROS" + "\n2. - BUSCAR LIBROS" + "\n3. - AGREGAR LIBRO" + "\n4. - BORRAR LIBRO" + "\n5.SALIR"));
                
                while(mAcL < 0 || mAcL > 5){
                    if(mAcL < 0 || mAcL > 5){    
                    JOptionPane.showMessageDialog(null, "NOTA: Por favor seleccione una de las acciones disponibles!!");
                    menuBiblioteca();
                    
                }
            }
                
                if(mAcL == 1){
                    //ArrayList<Libros> agregarLibros = new ArrayList<Libros>();
                    Biblioteca.mostrarLibros();
                    //revistasSugeridas();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcL == 2){
                    Biblioteca.buscarLibros();
                    
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcL == 3){
                    Biblioteca.agregarLibros();
                   
                }else if(mAcL == 4){
                    Biblioteca.borrarLibros();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                }else if(mAcL == 5){
                   System.exit(0);
                }
                break;
                
            case 2:
                int mAcR = Integer.parseInt(JOptionPane.showInputDialog(null, "::: ¿QUÉ DESEAS HACER? :::\n" +
                        "1. - VER REVISTAS" + "\n2. - BUSCAR REVISTAS" + "\n3. - AGREGAR REVISTAS" + "\n4. - BORRAR REVISTAS" + "\n5.SALIR"));
                
                while(mAcR < 0 || mAcR > 5){
                    if(mAcR < 0 || mAcR > 5){
                    JOptionPane.showMessageDialog(null, "NOTA: Por favor seleccione una de las acciones disponibles!!");
                    menuBiblioteca();
                }
            }
                
                if(mAcR == 1){
                    //ArrayList<Libros> agregarLibros = new ArrayList<Libros>();
                    Biblioteca.mostrarRevistas();
                    //librosSugeridos();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcR == 2){
                    Biblioteca.buscarRevistas();
                    
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcR == 3){
                    Biblioteca.agregarRevistas();
                   
                }else if(mAcR == 4){
                    Biblioteca.borrarRevistas();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                }else if(mAcR == 5){
                   System.exit(0);
                }
                break;
                
            case 3:
                int mAcT = Integer.parseInt(JOptionPane.showInputDialog(null, "::: ¿QUÉ DESEAS HACER? :::\n" +
                        "1. - VER TESIS" + "\n2. - BUSCAR TESIS" + "\n3. - AGREGAR TESIS" + "\n4. - BORRAR TESIS" + "\n5.SALIR"));
                
                while(mAcT < 0 || mAcT > 5){
                    if(mAcT < 0 || mAcT > 5){
                    JOptionPane.showMessageDialog(null, "NOTA: Por favor seleccione una de las acciones disponibles!!");
                    menuBiblioteca();
                }
            }
                
                if(mAcT == 1){
                    //ArrayList<Libros> agregarLibros = new ArrayList<Libros>();
                    Biblioteca.mostrarTesis();
                    //librosSugeridos();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcT == 2){
                    Biblioteca.buscarTesis();
                    
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcT == 3){
                    Biblioteca.agregarTesis();
                   
                }else if(mAcT == 4){
                    Biblioteca.borrarTesis();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                }else if(mAcT == 5){
                   System.exit(0);
                }
                break;
                
            case 4:
                int mAcV = Integer.parseInt(JOptionPane.showInputDialog(null, "::: ¿QUÉ DESEAS HACER? :::\n" +
                        "1. - VER VIDEOS" + "\n2. - BUSCAR VIDEOS" + "\n3. - AGREGAR VIDEOS" + "\n4. - BORRAR VIDEOS" + "\n5.SALIR"));
                
                while(mAcV < 0 || mAcV > 5){
                    if(mAcV < 0 || mAcV > 5){
                    JOptionPane.showMessageDialog(null, "NOTA: Por favor seleccione una de las acciones disponibles!!");
                    menuBiblioteca();
                }
            }
                
                if(mAcV == 1){
                    //ArrayList<Libros> agregarLibros = new ArrayList<Libros>();
                    Biblioteca.mostrarVideos();
                    //librosSugeridos();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcV == 2){
                    Biblioteca.buscarVideos();
                    
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                    
                }else if(mAcV == 3){
                    Biblioteca.agregarVideos();
                   
                }else if(mAcV == 4){
                    Biblioteca.borrarVideos();
                    MenuReturn = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONA:\n" +
                            "0. - REGRESAR AL MENÚ PRINCIPAL"));
                    
                    if(MenuReturn == 0){
                        menuBiblioteca();
                    }else{
                        JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                        menuBiblioteca();
                    }
                }else if(mAcV == 5){
                   System.exit(0);
                }
                break;
                
            case 5:
                   System.exit(0);
                   break; 
                   
            default:
                JOptionPane.showMessageDialog(null, "NOTA: Por favor ingrese una de las opciones disponibles en el menú!!");
                menuBiblioteca();
                break;
                
        }
    }

}
