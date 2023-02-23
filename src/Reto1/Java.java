package Reto1;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) throws Exception{
        Scanner Reto1 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre por favor :3");
        String name;
        name = Reto1.nextLine();
        System.out.println("Bienvenid@ " + name + " uwu");
        System.out.println("\nEn este programa vamos a convertir los grados Farenheit a Centigrados...,");
        System.out.print("la abuela necesita ayuda para hacer su torta");
        System.out.println("\nEntonces, ingresa por favor los grados Farenheit correspondientes");
        float Farenheit;
        Farenheit = Reto1.nextFloat();
        System.out.println("\nLos grados Farenheit que ingresaste son: "+Farenheit);
        System.out.println("\nEn grados Centigrados (°C), esto equivale a "+(Farenheit - 32)/1.8);
        System.out.println("\nLa abuela debe colocar el horno a "+(Farenheit - 32)/1.8);



        Reto1.close();

    }
}
