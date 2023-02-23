package Reto2;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner Reto2 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre por favor :3");
        String name;
        name = Reto2.nextLine();
        System.out.println("Bienvenid@ " + name + " uwu");
        System.out.println("\nEn este programa vamos a determinar la dosis necesaria en la vacuna para un bebé");
        System.out.println("Ingresa el peso de tu bebé, por favor");
        float pesobebe;
        pesobebe = Reto2.nextFloat();
        System.out.println("El peso de tu bebé es de: " + pesobebe + "kg");
        System.out.println("\nIngresa por favor los meses de tu bebé");
        int mesesbebe;
        mesesbebe = Reto2.nextInt();
        System.out.println("La edad tu bebé es de: " + mesesbebe);
        float dosisvacuna;
        dosisvacuna = (pesobebe+10)/(mesesbebe*10)*8;
        System.out.println("\n\n La dosis correcta de la vacuna para el bebé, es de "+dosisvacuna);
        Reto2.close();
    }
}
