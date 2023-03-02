package Apuesta;

import java.util.Scanner;

public class Apuesta {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digita tu nombre por favor");
        String name = lectura.nextLine();
        System.out.println();
        System.out.println("Bienvenid@ " + name + " a tu juego de apuestas favorito xdd");
        int valorGlobal = 1000000;
        System.out.println("El valor inicial a apostar es de " + valorGlobal + " pesitos");
        System.out.println("Recuerda que las reglas del carisellazo son las siguientes: ");
        System.out.println();


        lectura.close();
    }
}
