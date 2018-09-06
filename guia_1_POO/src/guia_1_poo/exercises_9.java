
package guia_1_poo;

import java.util.Scanner;

public class exercises_9 {
           

    public static void main(String args []){
         double  numero1, numero2;
        
        /*
        Crear una aplicación que realice las operaciones básicas de una calculadora 
        (sumar, restar, multiplicar, dividir). Debe utilizar estructura de control 
        switch y cada operación tendrá que ser creada en un método individual
        
        Debe mostrarle al usuario un menú con opciones a elegir. 
        El programador debe consultarle al usuario si desea terminar la aplicación. 
        (uso de do while). 
        */
        //1.1- mostrar la lista de opciones de operaciones 
        //1.2- pedir al usuario los dos números a operar
        //el usuario podra:
        //1- sumar
        //2- restar
        //3- multiplicar
        //4- dividir
        //1.3- utilizar estructura de control SWITCH
        //1.4- crear operaciones por método individual
        //1.5- preguntar si desea terminar la aplicación (do while)
        //
        //PASAR DE INT A STRING
        //cadena = String.valueOf(numero);
        //cadena= Integer.toString(numero);
        //PASAR DE STRING A INT
        //numero = Integer.parseInt(cadena)
         
        
        Scanner scanner = new Scanner(System.in);

        
        
        String operacion,respuesta,SI,NO;
        SI = "si";
        respuesta = "";
        System.out.println("Bienvenido/a a 'Consolecalculator' diviertete realizando operaciones!!\n");
        
        do {
        System.out.println("Por favor elige de nuestro menú, el número que corresponde a la operación que deseas realizar:\n");
        System.out.println("1" + ".-SUMA\n" + "2" + ".-RESTA\n" + "3" + ".-MULTIPLICACIÓN\n" + "4" + ".-DIVICIÓN\n");
        operacion = scanner.nextLine();
       
        
        
        switch (operacion){
          
           
            
        
            case "1":
                //case sum
                System.out.println("Ingrese el valor del número 1:");
                numero1 = scanner.nextDouble();
                
                System.out.println("Ingrese el valor del número 2:");
                numero2 = (scanner.nextDouble());
                
                //sum result
                System.out.println(sumar(numero1,numero2));
                //pregunto al usuario sí desea seguir utilizando la aplicación 
                respuesta = scanner.nextLine();
                break;
            
            case "2":
                //case subtraction
               // System.out.println("Ingrese el valor del número 1:");
               // resta.set_num1(scanner.nextDouble());
               // System.out.println("Ingrese el valor del número 2:");
               // resta.set_num2(scanner.nextDouble());
                
                //subtraction result
               // resta.operatorResta();
                //pregunto al usuario sí desea seguir utilizando la aplicación
                respuesta = scanner.nextLine();
            break;
            
            case "3":
                //case multiplication
               // System.out.println("Ingrese el valor del número 1:");
               // mult.set_num1(scanner.nextDouble());
               // System.out.println("Ingrese el valor del número 2:");
               // mult.set_num2(scanner.nextDouble());
                
                //Multiplication result
               // mult.operatorMultiplication();
                //pregunto al usuario sí desea seguir utilizando la aplicación
                respuesta = scanner.nextLine();
            break;
            
            case "4":
                //case divition
               // System.out.println("Ingrese el valor del número 1:");
               // div.set_num1(scanner.nextDouble());
               // System.out.println("Ingrese el valor del número 2:");
               // div.set_num2(scanner.nextDouble());
                 
                //Divition result
               // div.operatorDiv();  
                //pregunto al usuario sí desea seguir utilizando la aplicación
                respuesta = scanner.nextLine();
            break;
        }
        
        
        System.out.println("¿Deseas seguir usando la aplicación?");
                respuesta = scanner.nextLine();
        
        }while(respuesta.equalsIgnoreCase(SI));   
    }
         
         
         
public static double sumar(double numero1, double numero2){
    return numero1+numero2;
}                
    
    
public static double multiplicar (double numero1, double numero2){
    return numero1*numero2;
}                    
    
   
}
