package Coin;

import java.util.Random;
import java.util.Scanner;

public class Coin{
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        Scanner Coin = new Scanner(System.in);

        System.out.println("Bienvenido al programa Coin");
        System.out.println("Escoge cara o sello por favor");
        String respuesta;
        respuesta = Coin.nextLine();

        String opcionComputador  = random.nextBoolean() ? "cara" : "sello";
        
        System.out.println("Veamos si ganaste o perdiste");
        System.out.println("Cargando...\n");  
        
        
        if (opcionComputador.equals(respuesta)) {
            System.out.println("Lo siento, has perdido. El programa escogió " + opcionComputador + ", y tu escogiste " + respuesta);
        } else {
            System.out.println("Felicidades!!! Has ganado. El programa escogió " + opcionComputador + ", y tu escogiste " + respuesta);
        }
        Coin.close();
    }
}

