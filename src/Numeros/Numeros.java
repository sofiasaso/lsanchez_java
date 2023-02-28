package Numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
    Scanner Numeros = new Scanner(System.in);
    System.out.println("Bienvenido al programa de numeros");
    System.out.println("Ingresa un número por favor");
    int num1;
    num1 = Numeros.nextInt();
    System.out.println("Ingresa otro número por favor");
    int num2;
    num2 = Numeros.nextInt();

    if (num1>num2) {
        System.out.println("Ingresaste " + num1 + " y " + num2);
        System.out.println("El número 1 es mayor que el número 2");
        System.out.println("Por ende, se van a sumar ambos números");
        System.out.println("El resultado es de " + (num1 + num2));
    } else if (num1<num2) {
        System.out.println("Ingresaste " + num1 + " y " + num2);
        System.out.println("El número 2 es mayor que el número 1");
        System.out.println("Por ende, se van a restar ambos números");
        System.out.println("El resultado es de " + (num2 - num1));
    }else{
        System.out.println("Ingresaste " + num1 + " y " + num2);
        System.out.println("El número 1 es igual que el número 1");
        System.out.println("Por ende, se van a multiplicar ambos números");
        System.out.println("El resultado es de " + (num2 * num1));
    }
    Numeros.close();    
    }
}
