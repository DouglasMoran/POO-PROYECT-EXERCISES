
package evaluacionteorica;

import java.util.Scanner;

public class exercises3_L {
    
    public static void main(String args []){
        /*Crear una aplicación que permita realizar los cálculos de las áreas de
        figuras geométricas (de la ilustración 
        
        Crear un menú donde el usuario seleccionará el área que quiere calcular
        (usar estructura de control switch)
        
        Después de seleccionar la opción deseada se le preguntará al usuario si desea continuar
        haciendo otro calculo. (USAR  WHILE O DO WHILE)
        */
        showMenu();
    }
    
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        
        int select;
        double b,h,B,a,r,D,d,P,L;
        String respuesta,si,no;
        si = "Si";
        no = "No";
        
        System.out.println("\t*******CALCU-ÁREA*******");
        do{
        System.out.println("Seleccione el área que desea calcular:\n"
                + "1) Cuadrado\n2) Rectángulo\n3) Rombo\n4) Romboíde\n5) Trapecio\n6) Pentágono"
                + "\n7) Círculo\n8) Triángulo");
        select = scanner.nextInt();
        
        if(select < 0 || select > 8){
            System.out.println("NOTA: Por favor introduzca números validos de los que se muestran en el menú de opciones");
        }else{
            switch(select){
            case 1:
                //cuadrado
                System.out.println("Introduzca el valor de la longitud (L): ");
                L = scanner.nextDouble();
                //negativos no se permiten
                if(L < 0){
                    System.out.println("¡¡Tal cuadrado no existe!!");
                }else{
                    System.out.println("El área del cuadro es de: " + cuadrado(L));
                }
                
                break;
                
            case 2:
                //rectángulo
                System.out.println("Ingrese el valor de la base (b): ");
                b = scanner.nextDouble();
                //negativos no se permiten
                System.out.println("Ingrese el valor de la altura (h): ");
                h = scanner.nextDouble();
                
                if(b < 0 || h < 0){
                    System.out.println("¡¡Tal RECTÁNGULO no existe!!");
                }else{
                    System.out.println("El área del rectángulo es de: " + rectangulo(b,h));  
                }
                break;
            
            case 3:
                //rombo
                System.out.println("Ingrese el valor de diágonal mayor (D): ");
                D = scanner.nextDouble();
                System.out.println("Ingrese el valor de díágonal menor (d): ");
                d = scanner.nextDouble();
                if(D < 0 || d < 0){
                    System.out.println("¡¡Tal ROMBO no existe!!");
                }else{
                   System.out.println("El área del rombo es de: " + rombo(D,d)); 
                } 
                break;
                
            case 4:
                //romboide
                System.out.println("Ingrese el valor de la base (b): ");
                b = scanner.nextDouble();
                //negativos no se permiten
                System.out.println("Ingrese el valor de la altura (h): ");
                h = scanner.nextDouble();
                if(b < 0 || h < 0){
                    System.out.println("¡¡Tal ROMBOIDE no existe!!");
                }else{
                    System.out.println("El área del rectángulo es de: " + romboide(b,h));
                }
                break;
                
            case 5:
                //trapecio
                System.out.println("Ingrese el valor de la (B): ");
                B = scanner.nextDouble();
                
                System.out.println("Ingrese el valor de la (B): ");
                b = scanner.nextDouble();
                //negativos no se permiten
                System.out.println("Ingrese el valor de la altura (h): ");
                h = scanner.nextDouble();
                if(B < 0 || b < 0 || h < 0){
                    System.out.println("¡¡Tal TRAPECIO no existe!!");
                }else{
                   System.out.println("El área del trapecio es de: " + trapecio(B,b,h)); 
                }
                break;
                
            case 6:
                //pentágono
                System.out.println("IIngrese el valor de (P): ");
                P = scanner.nextDouble();
                //negativos no se permiten
                //HOTFIX 
                System.out.println("Ingrese el valor de (a): ");
                a = scanner.nextDouble();
                if(P < 0 || a < 0 ){
                    System.out.println("¡¡Tal PENTÁGONO no existe!!");
                }else{
                    System.out.println("El área del pentágono es de: " + pentagono(P,a));
                }
                break;
                
            case 7:
                //círculo;
                System.out.println("Ingrese el valor del radio (r): ");
                r = scanner.nextDouble();
                //negativos no se permiten
                if(r < 0){
                    System.out.println("¡¡Tal CÍRCULO no existe!!");
                }else{
                    System.out.println("El área del círculo es de: " + circulo(r));
                }
                break;    
                   
            case 8:
                //triángulo
                System.out.println("Ingrese el valor de la base (b): ");
                b = scanner.nextDouble();
                //negativos no se permiten8
                
                System.out.println("Ingrese el valor de la altura (h): ");
                h = scanner.nextDouble();
                if(b < 0 || h < 0){
                   System.out.println("¡¡Tal CÍRCULO no existe!!"); 
                }else{
                   System.out.println("El área del triángulo es de: " + triangulo(b,h));
                }
                break;    
        }
        }
            System.out.println("¿Desea continuar realizando otro calculo?");
            respuesta = scanner.next();
            
            if(respuesta != no){
                System.out.println("NOTA: Por favor no introduzca cáracteres especiales o numericos\n ¡¡SE HA CERRADO EL PROGRAMA!!");
            }
            
        }while(respuesta.equalsIgnoreCase(si) );
        
    }
    
    public static double cuadrado(double L){
        //formula: A = L2;
        double A;
        A = Math.pow(L, 2);
        return A;
        
    }
    
    public static double rectangulo(double b, double h){
        //A= b * h
        double A;
        A = b*h;
        return A;
    }
    
    public static double rombo(double D, double d){
                //A = (D*d)/2
                double A;
                A = (D*d)/2;
                return A;
    }
    
    public static double romboide(double b, double h){
        //A = b * h
        double A;
        A = b*h;
        return A;
    }
    
    public static double trapecio(double B, double b, double h){
       //A = ((B + b)/2)*h
       double A;
       A = ((B+b)/2)*h;
       return A;
    }
    
    //HOTFIX DE FÓRMULA DE PENTAGONO
    public static double pentagono(double P, double a){
        //A = (P * a)/2
        double A;
        A = (P*a)/2;
        return A;
    }
    
    public static double circulo(double r){
            //A = pi*r2;
            double A, pi;
            pi = 3.141516;
            A =  (pi*Math.pow(r, 2));
            return A;
    }
    
    public static double triangulo(double b, double h){
        //A = (b * h)/2
        double A;
        A = (b*h)/2;
        return A;
    
    }
      
}
