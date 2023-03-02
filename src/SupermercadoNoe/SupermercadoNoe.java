package SupermercadoNoe;

import java.util.Random;
import java.util.Scanner;

public class SupermercadoNoe {
    public static void main(String[] args) {
        Scanner SupermercadoNoe = new Scanner(System.in);
        System.out.println("Digita tu nombre antes de empezar, por favor");
        String name;
        name = SupermercadoNoe.nextLine();
        System.out.println("Bienvenid@ " + name);
        System.out.println("En supermercados Noé, estamos de aniversario!!!\n");
        System.out.println("Por ello, te vamos a obsequiar un descuento en el valor de tu compra");
        System.out.println("Sólo si esta es mayor a $ 50.000 y dependiendo de tu suerte");
        System.out.println("Buena suerte " + name);
        int compra, precioU, registrar=1, cantidad, valorPagado, cambio, acumulador=0;

        while (registrar==1) {
            System.out.println("\nDigita el precio del producto");
            precioU = SupermercadoNoe.nextInt();
            System.out.println("Digita la cantidad de los productos");
            cantidad = SupermercadoNoe.nextInt();
            System.out.println("Deseas ingresar más productos? Digita 1) Si o 2) No ");
            registrar = SupermercadoNoe.nextInt();
            compra = precioU * cantidad;
            acumulador = acumulador + compra;
        }      
        
        if (compra<50000) {
           System.out.println("Gracias por tu compra!");
           System.out.println("Esperamos verte nuevamente :)");
        }else{
            System.out.println("Por tu compra, tienes la oportunidad de escoger una pelota");
            System.out.println("Vamos a ver...");
            SupermercadoNoe.nextLine();

            Random ballons = new Random();
            String[] ballonsColors = {"white", "yellow", "blue", "red"};
            int pelotasNumberCase = ballons.nextInt(ballonsColors.length);
            String balloonColor = ballonsColors[pelotasNumberCase];


            switch (balloonColor) {
                case "red":
                    System.out.println("Obtuviste la pelota de color rojo...");
                    System.out.println("Vas a obtener un 10% de descuento en el total de tu compra");
                    compra = compra - (compra * 10)/100; 
                    System.out.println("El total de tu compra es de " + compra);
                    System.out.println("Digita el precio del dinero a pagar ");
                    valorPagado = SupermercadoNoe.nextInt();
                    cambio = compra - valorPagado;
                    System.out.println("Tu cambio es de " + cambio);
                    break;
                    
                case "blue":
                    System.out.println("Obtuviste la pelota de color azul...");
                    System.out.println("Vas a obtener un 30% de descuento en el total de tu compra");
                    compra = compra - (compra * 30)/100;
                    System.out.println("El total de tu compra es de " + compra);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    valorPagado = SupermercadoNoe.nextInt();
                    cambio = compra - valorPagado;
                    System.out.println("Tu cambio es de " + cambio);
                    break;

                case "yellow":
                    System.out.println("Obtuviste la pelota de color amarillo...");
                    System.out.println("Vas a obtener un 50% de descuento en el total de tu compra");
                    compra = compra - (compra * 50)/100;
                    System.out.println("El total de tu compra es de " + compra);
                    System.out.println("Ahora por favor ingresa el valor a pagar");
                    valorPagado = SupermercadoNoe.nextInt();
                    cambio = compra - valorPagado;
                    System.out.println("Tu cambio es de " + cambio);
                    break;

                case "white":
                    System.out.println("Obtuviste la pelota de color blanco...");
                    System.out.println("Vas a obtener tu compra gratis!!!");
                    compra = 0;
                    break;
            }

        }
        SupermercadoNoe.close();
    }
}
