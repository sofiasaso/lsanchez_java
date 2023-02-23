package CajaRegistradora;

import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner CajaRegistradora = new Scanner(System.in);    
        int precio, cantidad, contador = 0, subtotal, valorPagado, cambio, total = 0;
        String cuentaTelefonia;
        System.out.println("Bienvenido al programa de Caja Registradora \n");
        System.out.println("Espero disfrutes de tu compra");
        
        for (int x=1; x<=5 ; x++){
            System.out.println("Digite el precio del producto");
            precio = CajaRegistradora.nextInt();
            System.out.println("Digita la cantidad del producto");
            cantidad = CajaRegistradora.nextInt();

            contador++;
            subtotal = precio * cantidad;
            total = total + subtotal;
        }
        System.out.println("El total de tu compra es: " + total);
        System.out.println("Digita por favor el valor del billete con el que vas a pagar");
        valorPagado = CajaRegistradora.nextInt();
        cambio = valorPagado - total;
        System.out.println("El valor de tu cambio es de: " + cambio);
        System.out.println("Ahora, por favor me confirmas si tienes teléfonia móvil éxito");
        System.out.println("Digita Si para confirmar, digita No para finalizar");
        CajaRegistradora.nextLine(); 
        cuentaTelefonia = CajaRegistradora.nextLine();
        if (cuentaTelefonia.equals("Si")) {
            System.out.println("Gracias por confirmarnos");
            System.out.println("Ahora, podrás disfrutar " + contador + " minutos en llamadas, por tu cuenta Éxito");
            System.out.println("Gracias por tu compra");
        } else {
            System.out.println("No pierdas más minutos, adquiere ya tu telefonía móvil éxito");
        }
        CajaRegistradora.close();
    }
}
