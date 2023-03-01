package HazloTu;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner Promedio = new Scanner (System.in);
        System.out.println("Bienvenido al ejercicio de promedio");
        System.out.println("Vamos a evaluar tu promedio y a decirte si pasaste o no la materia");
        System.out.println("Recuerda que son 4 talleres");
        double nota = 0, totalnotas=0, promedio;


        while (nota>=1.0  || nota <=5.0) { 
            for (int x=1; x<=4; x++){
                System.out.println("\nDigita la nota de tu taller por favor: ");
                nota = Promedio.nextDouble();
                if (nota<1.0 || nota>5.0) {
                    System.out.println("Tu nota debe estar entre 1.0 y 5.0");
                }
                System.out.println("Tu nota fue de: " + nota);
                totalnotas = totalnotas + nota;
            }
            System.out.println("El total de tus notas fue de " + totalnotas); 
            promedio = totalnotas / 4;
            System.out.println("\nEl promedio tuyo fue de: " + promedio); 
            
                if (promedio>=0.0 && promedio<=2.9) {
                    System.out.println("Reprobaste la asignatura");
                } else if (promedio>=3.0 && promedio<=4.0) {
                    System.out.println("Pasaste raspando la asignatura");
                } else {
                    System.out.println("Aprobaste con buenos resultados");
                } 
                break;
            }
            Promedio.close();
        }
        }


