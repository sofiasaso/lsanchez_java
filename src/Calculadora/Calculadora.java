package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Calculadora = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora \n");
        System.out.println("Ingresa un número por favor");
        double numberOne, numberTwo;
        int op;
        numberOne = Calculadora.nextDouble();
        System.out.println("Ahora, ingresa otro número por favor");
        numberTwo = Calculadora.nextDouble();
        System.out.println("Los números ingresados fueron " + numberOne + " y " + numberTwo);

        System.out.println("\nIngresa una opción por favor: ");
        System.out.println("Si deseas sumar los números, presiona 1");
        System.out.println("Si deseas restar los números, presiona 2");
        System.out.println("Si deseas multiplicar los números, presiona 3");
        System.out.println("Si deseas dividir los números, presiona 4");
        System.out.println("Si deseas potenciar los números, presiona 5");
        System.out.println("Si deseas radicar los números, presiona 6");
        op = Calculadora.nextInt();
        switch (op) {
            case 1:
            System.out.println("Elegiste la operación de suma");
            System.out.println("El total de la suma es de " + (numberOne + numberTwo));
            break;

            case 2:
            System.out.println("Escogiste la operación de resta");
            System.out.println("El total de la resta es de " + (numberOne - numberTwo));
            break;

            case 3:
            System.out.println("Escogiste la operación de multiplicación");
            System.out.println("El total de la multiplicación es de " + (numberOne * numberTwo));  
            break;
            
            case 4:
            System.out.println("Escogiste la operación de división");
            System.out.println("El total de la división es de " + (numberOne / numberTwo));  
            break;

            case 5:
            double pot;
            pot = Math.pow(numberOne, numberTwo);
            System.out.println("Escogiste la operación de potenciación");
            System.out.println("El total de la potenciación es de " + pot);  
            break;

            case 6:
            double raizNumberOne, raizNumberTwo;
            raizNumberOne = Math.sqrt(numberOne);
            System.out.println("La raiz cuadrada del número "+ numberOne + " es " + raizNumberOne);
            raizNumberTwo = Math.sqrt(numberTwo);
            System.out.println("La raiz cuadrada del número "+ numberTwo + " es " + raizNumberTwo);
            break;

            default : 
            System.out.println("Lo siento, revisa nuevamente las opciones");
            break;
        }
        Calculadora.close();
    }
}
