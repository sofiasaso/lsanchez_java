package NumerosClases;

import java.util.Scanner;

public class NumerosClases {
    public static void main(String[] args) {
        Scanner NumerosClases = new Scanner(System.in);
        System.out.println("Bienvenido al programa de clases de números");
        System.out.println("Ingresa un número por favor");
        int num;
        num = NumerosClases.nextInt();

        if (num>0) {
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("El número es positivo");
        } else if (num<0) {
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("El número es negativo");
        }else{
            System.out.println("\nEl número que ingresaste fue " + num);
            System.out.println("El número es neutro"); 
        }
        System.out.println("\nGracias por usar el programa");
        NumerosClases.close();
    }
}
