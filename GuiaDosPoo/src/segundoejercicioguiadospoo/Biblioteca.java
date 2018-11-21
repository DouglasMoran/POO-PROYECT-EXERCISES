
package segundoejercicioguiadospoo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static segundoejercicioguiadospoo.EjercicioDosPoo.menuBiblioteca;

public class Biblioteca {
    
    static ArrayList<Libros> agregarLibros=new ArrayList<>();
    static ArrayList<Revistas> agregarRevistas = new ArrayList<>();
    static ArrayList<Tesis> agregarTesis = new ArrayList<>();
    static ArrayList<Videos> agregarVideos = new ArrayList<>();
    public Biblioteca() {
    }
    //OPERACIONES PARA LIBROS
    /*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    public static void librosSugeridos(){
        Libros librosSugeridos;
        
        librosSugeridos = new Libros("Los cuatro acuerdos", "John T. Balwin", "Creacionísmo", 125, 911612363, 2013, 1, "APIA");
        agregarLibros.add(librosSugeridos);
        librosSugeridos = new Libros("Las siete llaves del exito", "José Antonio De Garcia Hills", "Religión", 118, 9781611, 2015, 1, "APIA");
        agregarLibros.add(librosSugeridos);
        librosSugeridos = new Libros("Cuentos de barro", "Alejandro Bullón", "Religión", 140, 157554, 2008, 1, "APIA");
        agregarLibros.add(librosSugeridos);
    }
    
    public static void mostrarLibros() throws IOException, ClassNotFoundException{
        
            librosSugeridos();
        
            for (Libros item : agregarLibros) {
            JOptionPane.showMessageDialog(null, 
                    "Nombre: " + item.getNombre()
                    + " \n" +
                    "Autor: " + item.getAutor()
                    + " \n" +
                    "Categoria: " + item.getCategoria()
                    + " \n" +       
                    "Número de páginas: " + item.getNumeroPaginas()
                    + " \n " +
                    "ISBN: " + item.getIsbn()
                    + " \n " +
                    "Fecha de publicación: " + item.getFechaPublicacion()
                    + " \n " +
                    "Tomo: " + item.getTomo()
                    + " \n " +
                    "Editorial: " + item.getEditorial()
                    + "\n-------------------------------------------"
                );
            }
    }
    
    public static void buscarLibros() throws IOException, ClassNotFoundException{
        String restriccion = "";
        //String BNL;
        do{
          restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro a buscar:");  
        }while(restriccion.equals(""));
        
        for (Libros buscarLibro : agregarLibros) {
            if(buscarLibro.getNombre().equalsIgnoreCase(restriccion)){
                JOptionPane.showMessageDialog(null, "El libro se encontro correctamente:\n" + buscarLibro.mostrarDatosLibro());
                
            }
        }
    }
    
    public static  void agregarLibros() throws IOException, ClassNotFoundException{
        
        //agregarLibros = new ArrayList<Libros>();
        Libros libroAgregado;
        String nL,aL,cL,eL, salir = "";
        int npL = 0,isbnL = 0,fPL = 0,tL = 0;
        boolean validacionLibros = false;

        do{
           JOptionPane.showMessageDialog(null, ":::RELLENE EL FORMULARIO:::"); 
           do{
               nL =  JOptionPane.showInputDialog(null, "Ingrese el nombre del libro: ");
           }while(nL.equals(""));
           do{
               aL =  JOptionPane.showInputDialog(null, "Ingrese nombre del autor: ");
           }while(aL.equals(""));
           do{
               cL =  JOptionPane.showInputDialog(null, "Categoría: ");
           }while(cL.equals(""));
           do{
               try{
               npL =  Integer.parseInt(JOptionPane.showInputDialog(null, "Número de páginas: "));
               validacionLibros = true;
               }catch(Exception e){
                        System.out.println("ERROR LEYENDO DATO");
                }   
           }while(npL <= 0 || !validacionLibros);
           
           do{
               try{
                   isbnL =  Integer.parseInt(JOptionPane.showInputDialog(null, "ISBN: "));
                   validacionLibros = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(isbnL <= 0);
           do{
               try{ 
               fPL =  Integer.parseInt(JOptionPane.showInputDialog(null, "Fecha de publicación: "));
               validacionLibros = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(fPL <= 0);
           do{
               try{
               tL =  Integer.parseInt(JOptionPane.showInputDialog(null, "Tomo del libro: "));
               validacionLibros = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(tL <= 0);
           do{
               eL =  JOptionPane.showInputDialog(null, "Editorial: ");
           }while(eL.equals(""));
           
           libroAgregado = new Libros(nL, aL, cL, npL, isbnL, fPL, tL, eL);
           agregarLibros.add(libroAgregado);
           
           int rM =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qué deseas hacer: " + "\n1. - CONTINUAR" + "\n0. - REGRESAR AL MENÚ PRINCIPAL"));
           
            if(rM == 0){
               menuBiblioteca();
            }else if(rM == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                menuBiblioteca();
            }
        }while(!salir.equalsIgnoreCase("2"));
        
    }
    
    public static void borrarLibros() throws IOException, ClassNotFoundException{
        String restriccion = "";
        do{
            restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro a borrar:");
            //String clearCL = JOptionPane.showInputDialog(null, "Ingrese autor del libro a borrar:");
        }while(restriccion.equals(""));
        
        for (int i = 0; i < agregarLibros.size(); i++) {
            Libros borrarLibro = agregarLibros.get(i);
            if(borrarLibro.getNombre().equalsIgnoreCase(restriccion)
                   /* && borrarLibro.getAutor().equals(clearCL)*/){
                agregarLibros.remove(i);
                JOptionPane.showMessageDialog(null, "El libro se borro correctamente");
               
            }
        }
        
    }
    /*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    //OPERACIONES PARA REVISTAS
    public static void revistasSugeridas(){
        
        Revistas revistaSugerida;
        
        revistaSugerida = new Revistas("Internet de las cosas", "MIT", "Tecnología", 117, 9875642, 2017);
        agregarRevistas.add(revistaSugerida);
        revistaSugerida = new Revistas("La cuarta revolucion", "Oxford", "Tecnología", 97, 8730642, 2018);
        agregarRevistas.add(revistaSugerida);
        revistaSugerida = new Revistas("Teoria espacio tiempo", "Steven H", "Fisica", 198, 300140642, 2018);
        agregarRevistas.add(revistaSugerida);  

    }
    
    public static void mostrarRevistas(){
            
            revistasSugeridas();
        
            for (Revistas itemR : agregarRevistas) {
            JOptionPane.showMessageDialog(null, 
                    "Nombre: " + itemR.getNombre()
                    + " \n" +
                    "Autor: " + itemR.getAutor()
                    + " \n" +
                    "Categoria: " + itemR.getCategoria()
                    + " \n" +       
                    "Número de páginas: " + itemR.getNumeroPaginas()
                    + " \n " +
                    "ISBN: " + itemR.getIsbn()
                    + " \n " +
                    "Fecha de publicación: " + itemR.getFechaPublicacion()
                    + "\n-------------------------------------------"
                );
            }
    }
    
    public static void buscarRevistas() throws IOException, ClassNotFoundException{
        String restriccion = "";
        //String BNL;
        do{
          restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Revista a buscar:");  
        }while(restriccion.equals(""));
        
        for (Revistas buscarRevista : agregarRevistas) {
            if(buscarRevista.getNombre().equalsIgnoreCase(restriccion)){
                JOptionPane.showMessageDialog(null, "La Revista se encontro correctamente:\n" + buscarRevista.datosRevistas());
                
            }
        }
    }
    
    public static void agregarRevistas() throws IOException, ClassNotFoundException{
        Revistas revistaAgregada;
        String nR,aR,cR, salir = "";
        int npR = 0,isbnR = 0,fPR = 0;
        boolean validacionRevistas= false;
        do{
           JOptionPane.showMessageDialog(null, ":::RELLENE EL FORMULARIO:::"); 
           do{
               nR =  JOptionPane.showInputDialog(null, "Ingrese el nombre de la Revista: ");
           }while(nR.equals(""));
           do{
               aR =  JOptionPane.showInputDialog(null, "Ingrese nombre de la agencia publicadora: ");
           }while(aR.equals(""));
           do{
               cR =  JOptionPane.showInputDialog(null, "Categoría: ");
           }while(cR.equals(""));
           do{
               try{
               npR =  Integer.parseInt(JOptionPane.showInputDialog(null, "Número de páginas: "));
               validacionRevistas = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(npR <= 0);
           do{
               try{
               isbnR =  Integer.parseInt(JOptionPane.showInputDialog(null, "ISBN: "));
               validacionRevistas = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(isbnR <= 0);
           do{
               try{
               fPR =  Integer.parseInt(JOptionPane.showInputDialog(null, "Fecha de publicación: "));
               validacionRevistas = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(fPR <= 0);
           
           revistaAgregada = new Revistas(nR, aR, cR, npR, isbnR, fPR);
           agregarRevistas.add(revistaAgregada);
           
           int rM =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qué deseas hacer: " + "\n1. - CONTINUAR" + "\n0. - REGRESAR AL MENÚ PRINCIPAL"));
           
            if(rM == 0){
               menuBiblioteca();
            }else if(rM == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                menuBiblioteca();
            }
        }while(!salir.equalsIgnoreCase("2"));
    }
    
    public static void borrarRevistas() throws IOException, ClassNotFoundException{
        String restriccion = "";
        do{
            restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre de la revista a borrar:");
            //String clearCL = JOptionPane.showInputDialog(null, "Ingrese autor del libro a borrar:");
        }while(restriccion.equals(""));
        
        for (int i = 0; i < agregarRevistas.size(); i++) {
            Revistas borrarRevista = agregarRevistas.get(i);
            if(borrarRevista.getNombre().equalsIgnoreCase(restriccion)
                   /* && borrarLibro.getAutor().equals(clearCL)*/){
                agregarRevistas.remove(i);
                JOptionPane.showMessageDialog(null, "La Revista se borro correctamente");
            }
        }
        
    }
    /*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    //OPERACIONES PARA TESIS
    public static void tesisSugeridas(){
        Tesis tesSugerida;
        
        tesSugerida = new Tesis("Psicologia del color", "No sé alguien por allí", "Tecnología", 119, 52041, 2016);
        agregarTesis.add(tesSugerida);
        tesSugerida = new Tesis("Las 99 tesis", "Melville H", "Literario", 600, 78041, 1999);
        agregarTesis.add(tesSugerida);
        tesSugerida = new Tesis("Inteligencia Artificial", "Shakespeare W.", "Ciencia Ficción", 477, 4103217, 2011);
        agregarTesis.add(tesSugerida);
        
    }
    
    public static void mostrarTesis(){
            tesisSugeridas();

            for (Tesis itemT : agregarTesis) {
            JOptionPane.showMessageDialog(null, 
                    "Nombre: " + itemT.getNombre()
                    + " \n" +
                    "Autor: " + itemT.getAutor()
                    + " \n" +
                    "Categoria: " + itemT.getCategoria()
                    + " \n" +       
                    "Número de páginas: " + itemT.getNumeroPaginas()
                    + " \n " +
                    "ISBN: " + itemT.getIsbn()
                    + " \n " +
                    "Fecha de publicación: " + itemT.getFechaPublicacion()
                    + "\n-------------------------------------------"
                );
            }
    }
    
    public static void buscarTesis() throws IOException, ClassNotFoundException{
        String restriccion = "";
        //String BNL;
        do{
          restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro a buscar:");  
        }while(restriccion.equals(""));
        
        for (Tesis buscarTesis : agregarTesis) {
            if(buscarTesis.getNombre().equalsIgnoreCase(restriccion)){
                JOptionPane.showMessageDialog(null, "El libro se encontro correctamente:\n" + buscarTesis.mostrarDatosTesis());
                
            }
        }
    }
    
    public static  void agregarTesis() throws IOException, ClassNotFoundException{
        
        Scanner scannerNumeros = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);
        agregarTesis = new ArrayList<Tesis>();
        Tesis tesisAgregada;
        String nT,aT,cT, salir = "";
        int npT = 0,isbnT = 0,fPT = 0;
        boolean validacionTesis = false;
        do{
           JOptionPane.showMessageDialog(null, ":::RELLENE EL FORMULARIO:::"); 
           do{
               nT =  JOptionPane.showInputDialog(null, "Ingrese el nombre de la Tesis: ");
           }while(nT.equals(""));
           do{
               aT =  JOptionPane.showInputDialog(null, "Ingrese nombre del autor de la Tesis: ");
           }while(aT.equals(""));
           do{
               cT =  JOptionPane.showInputDialog(null, "Categoría: ");
           }while(cT.equals(""));
           do{ 
               try{
               npT =  Integer.parseInt(JOptionPane.showInputDialog(null, "Número de páginas: "));
               validacionTesis = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(npT <= 0);
           do{
               try{
               isbnT =  Integer.parseInt(JOptionPane.showInputDialog(null, "ISBN: "));
               validacionTesis = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(isbnT <= 0);
           do{
               try{
               fPT =  Integer.parseInt(JOptionPane.showInputDialog(null, "Fecha de publicación: "));
               validacionTesis = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(fPT <= 0);
           
           tesisAgregada = new Tesis(nT, aT, cT, npT, isbnT, fPT);
           agregarTesis.add(tesisAgregada);
           
           int rM =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qué deseas hacer: " + "\n1. - CONTINUAR" + "\n0. - REGRESAR AL MENÚ PRINCIPAL"));
           
            if(rM == 0){
               menuBiblioteca();
            }else if(rM == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                menuBiblioteca();
            }
        }while(!salir.equalsIgnoreCase("2"));
        
    }
    
    public static void borrarTesis() throws IOException, ClassNotFoundException{
        String restriccion = "";
        do{
            restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Tesis a borrar:");
            //String clearCL = JOptionPane.showInputDialog(null, "Ingrese autor del libro a borrar:");
        }while(restriccion.equals(""));
        
        
        for (int i = 0; i < agregarTesis.size(); i++) {
            Tesis borrarTesis = agregarTesis.get(i);
            if(borrarTesis.getNombre().equalsIgnoreCase(restriccion)
                   /* && borrarLibro.getAutor().equals(clearCL)*/){
                agregarTesis.remove(i);
                JOptionPane.showMessageDialog(null, "El libro se borro correctamente");
               
            }
        }
        
    }
    /*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    //OPERACIONES PARA VIDEOS
    
    public static void videosSugeridos(){
        Videos videosSugeridos;
        
        videosSugeridos = new Videos("PHP Frameworks", "MitoCode", 120, "Aprenderas como utilizar frameworks PHP", "D");
        agregarVideos.add(videosSugeridos);
        videosSugeridos = new Videos("MySQL DB", "Platzi", 190, "Conoce las bases de MySQL", "A");
        agregarVideos.add(videosSugeridos);
        videosSugeridos = new Videos("Terminal Linea de Comandos", "Platzi", 90, "Domina de manera avanza la terminal del potento OS Linux", "A");
        agregarVideos.add(videosSugeridos);
        
    }
    
    public static void mostrarVideos(){
            
            videosSugeridos();
        
            for (Videos itemV : agregarVideos) {
            JOptionPane.showMessageDialog(null, 
                    "Titulo: " + itemV.getTitulo()
                    + " \n" +
                    "Creador: " + itemV.getCreador()
                    + " \n" +
                    "Duración: " + itemV.getDuracion()
                    + " \n " +
                    "Descripción: " + itemV.getDescripción()
                    + " \n " +
                    "Clasificación: " + itemV.getClasificacion()
                    + "\n-------------------------------------------"
                );
            }
    }
    
    public static void buscarVideos() throws IOException, ClassNotFoundException{
        String restriccion = "";
        //String BNL;
        do{
          restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre del video a buscar:");  
        }while(restriccion.equals(""));
        
        for (Videos buscarVideo : agregarVideos) {
            if(buscarVideo.getTitulo().equalsIgnoreCase(restriccion)){
                JOptionPane.showMessageDialog(null, "El video se encontro correctamente:\n" + buscarVideo.datosVideo());
                
            }
        }
    } 
    
    public static  void agregarVideos() throws IOException, ClassNotFoundException{
        
        Scanner scannerNumeros = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);
        agregarVideos = new ArrayList<Videos>();
        Videos videoAgregado;
        String tV,cV,descV,clasV,salir = "";
        int dV = 0;
        boolean validacionVideos = false;
        do{
           JOptionPane.showMessageDialog(null, ":::RELLENE EL FORMULARIO:::"); 
           do{
               tV =  JOptionPane.showInputDialog(null, "Ingrese el titulo del Videos: ");
           }while(tV.equals(""));
           do{
               cV =  JOptionPane.showInputDialog(null, "Ingrese nombre del creador del video: ");
           }while(cV.equals(""));
           do{
               try{
               dV =  Integer.parseInt(JOptionPane.showInputDialog(null, "Duración: "));
               validacionVideos = true;
               }catch(Exception e){
                   System.out.println("ERROR LEYENDO DATO");
               }
           }while(dV <= 0);
           do{
               descV =  JOptionPane.showInputDialog(null, "Descripción del video: ");
           }while(descV.equals(""));
           do{
               clasV =  JOptionPane.showInputDialog(null, "Clasificación: ");
           }while(clasV.equals(""));
           
           videoAgregado = new Videos(tV, cV, dV, descV, clasV);
           agregarVideos.add(videoAgregado);
           
           int rM =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qué deseas hacer: " + "\n1. - CONTINUAR" + "\n0. - REGRESAR AL MENÚ PRINCIPAL"));
           
            if(rM == 0){
               menuBiblioteca();
            }else if(rM == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "NOTA: Tal opción no existe, sera redirigido al menú principal!!");
                menuBiblioteca();
            }
        }while(!salir.equalsIgnoreCase("2"));
        
    }
    
    public static void borrarVideos() throws IOException, ClassNotFoundException{
        String restriccion = "";
        do{
            restriccion = JOptionPane.showInputDialog(null, "Ingrese el nombre del video a borrar:");
            //String clearCL = JOptionPane.showInputDialog(null, "Ingrese autor del libro a borrar:");
        }while(restriccion.equals(""));
        
        
        for (int i = 0; i < agregarVideos.size(); i++) {
            Videos borrarVideo = agregarVideos.get(i);
            if(borrarVideo.getTitulo().equalsIgnoreCase(restriccion)
                   /* && borrarLibro.getAutor().equals(clearCL)*/){
                agregarLibros.remove(i);
                JOptionPane.showMessageDialog(null, "El video se borro correctamente");
               
            }
        }
        
    }
    
}
