package While;

import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        int presupuesto = 100000, gasto, contador=0, seguir=1, acumulador=0;
        
                while (seguir==1 && contador <3){
                   
                        System.out.println("Ingrese el valor del gasto");
                        gasto = lectura.nextInt();
                        System.out.println("Registraste un gasto de " + gasto);
                        presupuesto -= gasto;
                        System.out.println("Tienes un presupuesto actual de " + presupuesto + " pesitos");
                        System.out.println("Desea registrar otro gasto? digita 1) Si o 2) No\n");
                        seguir = lectura.nextInt();
                        contador = contador + 1;
                        acumulador = acumulador + gasto;
                    if (contador==3) {
                        System.out.println("Ya no puedes agregar más gastos");
                    }
                    
            }
            System.out.println("Tienes un presupuesto total de " + presupuesto);
            System.out.println("El valor total de tus gastos fue de: " + acumulador);
            lectura.close();      
        }
    }

