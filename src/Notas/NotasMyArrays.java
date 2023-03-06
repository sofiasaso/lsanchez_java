package Notas;

import java.util.Scanner;

public class NotasMyArrays {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digita tu nombre por favor");
        String name;
        name = lectura.nextLine();
        System.out.println("\nBienvenido a notas " + name);
        System.out.println("\nIngresar la cantidad de notas");
        int cantidad = lectura.nextInt();
        float notas[] = new float[cantidad];
        float sumaNotas=0, promedio, nota;

        for (int i=0; i<= (cantidad-1); i++ ) {
            System.out.println("\nDigita tu nota ");
            nota = lectura.nextFloat();
            System.out.println("La nota que ingresaste fue de " + nota);
            sumaNotas = sumaNotas + nota;
        }
        promedio = sumaNotas/cantidad;

        if (promedio<3.0) {
            System.out.println("\nTu promedio fue de " + promedio);
            System.out.println("Reprobaste");
        } else if (promedio==3.0 && promedio<=4.0) {
            System.out.println("\nTu promedio fue de " + promedio);
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("\nTu promedio fue de " + promedio);
            System.out.println("Aprobaste con buenos resultados");
        }
        lectura.close();
    }
}
