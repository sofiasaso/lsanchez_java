package Login;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) throws Exception{
        Scanner Login = new Scanner(System.in);
        String U = "admin";
        String P = "1234";
        boolean encontrado = false; // Variable para seguir ejecutando el bucle hasta que el usuario introduzca los datos correctos

        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema \n"
                + "Primero debemos verificar sus datos.");

        // Inicializar variables, pero solicitar la entrada del usuario en el bucle.
        String user = "";
        String pass = "";

        while(!encontrado){ // Ejecutar el bucle hasta que el usuario introduzca los datos correctos
            // Pedir aquí los datos al usuario para solicitar de nuevo si falla.
            user = JOptionPane.showInputDialog("Ingrese el Usuario: ");
            pass = JOptionPane.showInputDialog("Ingrese la contraseña: ");

            if(U.equals(user)){
                if(P.equals(pass)){
                    JOptionPane.showMessageDialog(null, "Bienvenido ");
                    encontrado = true; // Se abandona el bucle

                }else{
                    JOptionPane.showMessageDialog(null,
                            "Contraseña Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,
                        "El usuario es invalido!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        Login.close();
    }
}


    
