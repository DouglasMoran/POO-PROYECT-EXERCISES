
package evaluacionteorica;

import java.util.Scanner;

public class exercises02 {
    
    public static void main(String args []){
        /*Emitir la factura correspondiente a una compra de un artículo determinado del que se 
        adquieren una o varias unidades. El IVA a aplicar es del 13% y si la compra total
        (precio venta + IVA) es mayor o igual a $30.00 se aplicará un descuento del 10%, si la 
        compra total es mayor de $30.00 y menor o igual a $70.00 se aplicará un descuento del 25%
        y si la compra total es mayor a $70.00 se aplicará un descuento del 35%*/
        Scanner scanner = new Scanner(System.in);
        double precioA,descD,descV,descT;
        int cantidadA;
        System.out.println("\t*******BIENVENIDA/O A LA MEJOR TIENDA ONLINE*******\n"
                + "¡¡tenemos siempre los mejores descuentos para ti, disfruta comprando los mejores productos!!\n");
        
        System.out.println("Ingresa precio del artículo:");
        precioA = scanner.nextDouble();
        
        System.out.println("Ingresa unidades compradas del artículo:");
        cantidadA = scanner.nextInt();
        
        if(precioA <= 0 && cantidadA <= 0){
            System.out.println("NOTA: No puede realizar compras de este tipo, por lo tanto no podemos procesar la factura correspondiente!!");
            System.out.println("¡¡GRACIAS!!");
        }
        else if(datosCompra(precioA,cantidadA) <= 30){
            //10% HOTFIX RESUELTO
            descD = (10*datosCompra(precioA,cantidadA)/100);
            double totalApagar = datosCompra(precioA,cantidadA) - descD;
            System.out.println("\nHas obtenido un descuento del 10% en tu compra\n");
            System.out.println("El precio inicial c/u: " + " $ " + precioA + "\nSe aplico el IVA: 13%\n" + "Precio final:" + " $ " + datosCompra(precioA,cantidadA) + "\nUnidades compradas: " + cantidadA + "\n" + "Descuento aplicado:" + " $ " + descD + "\nTotal a pagar: "  + " $ " + totalApagar);
            System.out.println("¡¡GRACIAS POR PREFERIRNOS!!");
        }
        else if(datosCompra(precioA,cantidadA) > 30 && datosCompra(precioA,cantidadA) <= 70){
            //25%
            descV = ((datosCompra(precioA,cantidadA)*25)/100);
            double totalApagar = (datosCompra(precioA,cantidadA)-descV);
            System.out.println("\nHas obtenido un descuento del 25% en tu compra\n");
            System.out.println("El precio inicial c/u: " + " $ " + precioA + "\nSe aplico el IVA: 13%\n" + "Precio final:" + " $ " + datosCompra(precioA,cantidadA) + "\nUnidades compradas: " + cantidadA + "\n" + "Descuento aplicado:" + " $ " + descV + "\nTotal a pagar: "  + " $ " + totalApagar);
            System.out.println("¡¡GRACIAS POR PREFERIRNOS!!");
        }
        else if(datosCompra(precioA,cantidadA) > 70){
            //35%
            descT = (datosCompra(precioA,cantidadA)*35)/100;
            double totalApagar = datosCompra(precioA,cantidadA) - descT;
            System.out.println("\nHas obtenido un descuento del 35% en tu compra\n");
            System.out.println("El precio inicial c/u: " + " $ " + precioA + "\nSe aplico el IVA: 13%\n" + "Precio final:" + " $ " + datosCompra(precioA,cantidadA) + "\nUnidades compradas: " + cantidadA + "\n" + "Descuento aplicado:" + " $ " + descT + "\nTotal a pagar: "  + " $ " + totalApagar);
            
        }
    }
    
    public static double datosCompra(double precioA, double cantidadA){
        
        double IVA,total_C_A,ivaG;
        total_C_A = 0;
        for(int i=0; i<cantidadA; i++){
            IVA = 0.13;
            ivaG = precioA*IVA;
            total_C_A = (precioA+ivaG)*cantidadA;  
        }
        return total_C_A;
           
    }
    
}
