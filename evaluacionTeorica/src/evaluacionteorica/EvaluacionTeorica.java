
package evaluacionteorica;

import java.util.Scanner;

public class EvaluacionTeorica {

    public static void main(String[] args) {
        //EJERCICIO 1 (TEORÍA)
        /*
        Realice los cálculos necesarios para convertir una cantidad de dinero en una moneda
        inicial a otra moneda final. Las monedas disponibles en el programa son:
        a) Peso mexicano
        b) Dólares.
        c) Euro
        d) Yen japonés.
        según la selección del usuario.
        
        ejemplos: usuario puede indicar que su aplicación determine ¿A cuántos Yenes
        equivalen 24 Euros?
        ¿A cuánto equivale 45.34 dólares a Euros?
        */
        //DIVIDE Y VENCERAS
        /*
        1- investigar el valor de cada divisa: {
            **YEN JAPONÉS**
            1 yen = 0.17 peso mexicano
            1 yen = 0.0077 euro
            1 yen = 0.0090
        
            **PESO MEXICANO**
            1 peso = 5.82 yen
            1 peso = 0.045 euro
            1 peso = 0.052 dólar
            
            **EURO**
            1 euro = 129.64 yen
            1 euro = 22.27 peso mexicano
            1 euro = 1.17 dolarestadounidense
        
        cantidad*valor/monedaValor
        
            **DÓLAR ESTADOUNIDENSE**
            1 dólar = 111.22 yen
            1 dólar = 19.13 peso mexicano
            1 dólar = 0.86 euro
        }
        2- declarar variables que contengan su valor 
        3- mostrar al usuario las divisas que puede realizar conversión
        4- tomar el dato del usuario
        5- realizar operación de conversión entre divisa y dato del usuario (cantidad moneda)
        6- mostrar el resultado de conversión al usuario
        7- preguntar si desea realizar otra conversión de divisa
        */
        
        showMenu();
        
    }
    
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        
        int select;
        double yen,pesoMx,euro,dolar;
        
       //do{
            System.out.println("BIENVENIDO/A AL CONVERTIDOR DE DIVISAS \nPodras convertir las siguientes monedas elige una de las que se muestrán a continuación:\n 1) Yenes (Yen)\n 2) Peso Mexicano\n "
                + "3) Euro\n 4) Dolarestadounidense\n 0) Cerrar programa");
            select = scanner.nextInt();
            
            if(select > 4){
                 System.out.println("\nNOTA: La selección es invalida, eliga una de las opciones que se muestra en pantalla\n");
             }
            
            switch(select){
            
             case 1:
                 convertYen();
             break;
             
             case 2:
                 convertPesoMx();
             break;
             
             case 3:
                convertEuro();
             break;
             
             case 4:
                convertDolar();
             break;
             
             case 0:
                 
                 break; 
             
             default: 
             break;  
        }
            
        //}while(select != 0);   
    }
    
    public static void convertYen(){ 
        Scanner scanner = new Scanner(System.in);
        
        int convert;
        String si,no,respuesta;
        si = "si";
        no = "No";
        
        do{
        System.out.println("Elige a que divisa deseas convertir:\n 1) Peso mexicanos\n 2) Euros\n 3) Dolarestadounidense\n");
        convert = scanner.nextInt();
        
        if(convert > 3){
            System.out.println("\nDicha elección no exite");
            System.out.println("NOTA: elige una elección de las que se muestra en pantalla\n");
        }else{
            //System.out.println("Buena elección");
        }
        
        double moneda,mYaPmx,mYaE,mYaD,yen,pesoMx,euro,dolar;
        //cantidad*valor/monedaValor
        yen = 0.17;
        pesoMx = 5.82;
        dolar = 0.0090;
        euro = 0.0077;
        
        switch(convert){
            
            case 1:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                
                 mYaPmx = moneda*yen;
                 System.out.println("La cantidad de " + moneda + "Yen, es equivalente a: " + mYaPmx + " pesos Mexicano");
            break;
            
            case 2:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mYaE = moneda*euro;
                 System.out.println("La cantidad de " + moneda + "Yen, es equivalente a: " + mYaE + " euros");
            break;
            
            case 3:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mYaD = moneda*dolar;
                 System.out.println("La cantidad  de " + moneda + "Yen, es equivalente a: " + mYaD + " Dolarestadounidense");
            break;
            
        }
        
        System.out.println("¿Desea seguir convirtiendo?");
            respuesta  = scanner.next();
            
            if(respuesta.equalsIgnoreCase(no)){
                showMenu();
            }
        
        }while(respuesta != si);  
    }
    
    public static void convertPesoMx(){
        Scanner scanner = new Scanner(System.in);
        
        int convert;
        String si,no,respuesta;
        si = "si";
        no = "No";
        
        do{
        System.out.println("Elige a que divisa deseas convertir:\n 1) Yen Japónes\n 2) Euros\n 3) Dolarestadounidense\n");
        convert = scanner.nextInt();
        
        if(convert > 3){
            System.out.println("\nDicha elección no exite");
            System.out.println("NOTA: elige una elección de las que se muestra en pantalla\n");
        }else{
            //System.out.println("Buena elección");
        }
        
        double moneda,mPmxaY,mPmxaE,mPmxaD,yen,pesoMx,euro,dolar;
        yen = 5.82;
        pesoMx = 5.82;
        dolar = 0.052;
        euro = 0.045;
        
        switch(convert){
            
            case 1:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                
                 mPmxaY = moneda*pesoMx;
                 System.out.println("La cantidad de " + moneda + "Pesos, es equivalente a: " + mPmxaY + " Yen");
            break;
            
            case 2:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mPmxaE = moneda*euro;
                 System.out.println("La cantidad"
                         + " de " + moneda + "Pesos, es equivalente a: " + mPmxaE + " euros");
            break;
            
            case 3:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mPmxaD = moneda*dolar;
                 System.out.println("La cantidad"
                         + " de " + moneda + "Pesos, es equivalente a: " + mPmxaD + " Dolarestadounidense");
            break;
            
        }
        
        System.out.println("¿Desea seguir convirtiendo?");
            respuesta  = scanner.next();
            
            if(respuesta.equalsIgnoreCase(no)){
                showMenu();
            }
        
        }while(respuesta != si);
    }
    
    public static void convertEuro(){
        Scanner scanner = new Scanner(System.in);
        
        int convert;
        String si,no,respuesta;
        si = "si";
        no = "No";
        
        do{
        System.out.println("Elige a que divisa deseas convertir:\n 1) Peso mexicanos\n 2) Yen\n 3) Dolarestadounidense\n");
        convert = scanner.nextInt();
        
        if(convert > 3){
            System.out.println("\nDicha elección no exite");
            System.out.println("NOTA: elige una elección de las que se muestra en pantalla\n");
        }else{
            //System.out.println("Buena elección");
        }
        
        double moneda,mEaPmx,mEaY,mEaD,yen,pesoMx,euro,dolar;
        yen = 129.64;
        pesoMx = 22.27;
        dolar = 1.17;
        euro = 0.0077;
        
        switch(convert){
            
            case 1:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                
                 mEaPmx = moneda*pesoMx;
                 System.out.println("La cantidad de " + moneda + "euros, es equivalente a: " + mEaPmx + " pesos Mexicano");
            break;
            
            case 2:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mEaY = moneda*yen;
                 System.out.println("La cantidad de " + moneda + "Yen, es equivalente a: " + mEaY + " euros");
            break;
            
            case 3:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mEaD = moneda*dolar;
                 System.out.println("La cantidad"
                         + " de " + moneda + "Yen, es equivalente a: " + mEaD + " Dolarestadounidense");
            break;
            
        }
        
        System.out.println("¿Desea seguir convirtiendo?");
            respuesta  = scanner.next();
            
            if(respuesta.equalsIgnoreCase(no)){
                showMenu();
            }
        
        }while(respuesta != si);
    }
    
    public static void convertDolar(){
        Scanner scanner = new Scanner(System.in);
        
        int convert;
        String si,no,respuesta;
        si = "si";
        no = "No";
        
        do{
        System.out.println("Elige a que divisa deseas convertir:\n 1) Peso mexicanos\n 2) Euros\n 3) Yenes (Yen Japónes)\n");
        convert = scanner.nextInt();
        
        if(convert > 3){
            System.out.println("\nDicha elección no exite");
            System.out.println("NOTA: elige una elección de las que se muestra en pantalla\n");
        }else{
            //System.out.println("Buena elección");
        }
        
        double moneda,mDaPmx,mDaE,mDaY,yen,pesoMx,euro,dolar;
        yen = 111.22;
        pesoMx = 19.13;
        dolar = 0.0090;
        euro = 0.86;
        
        switch(convert){
            
            case 1:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                
                 mDaPmx = moneda*pesoMx;
                 System.out.println("La cantidad de " + moneda + "Dólar, es equivalente a: " + mDaPmx + " pesos Mexicano");
            break;
            
            case 2:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mDaE = moneda*euro;
                 System.out.println("La cantidad de " + moneda + "Dólar, es equivalente a: " + mDaE + " euros");
            break;
            
            case 3:
                System.out.println("Ingrese la cantidad a convertir:");
                 moneda = scanner.nextDouble();
                 mDaY = moneda*yen;
                 System.out.println("La cantidad de " + moneda + "Dólar, es equivalente a: " + mDaY + " Yenes");
            break;
            
        }
        
        System.out.println("¿Desea seguir convirtiendo?");
            respuesta  = scanner.next();
            
            if(respuesta.equalsIgnoreCase(no)){
                showMenu();
            }
        
        }while(respuesta != si);
    }
}
