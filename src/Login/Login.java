package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception{

        System.out.println("Bienvenido a Login <3, primero debo revisar tus datos");

        String validUser = "admin";
        String validPassword = "1234";

        Scanner Login = new Scanner(System.in);
        System.out.print("Ingresa tu usuario, por favor: ");
        String user = Login.nextLine();

        System.out.print("Ingresa tu contraseña, por favor: ");
        String password = Login.nextLine();

        if (user.equals(validUser) && password.equals(validPassword)) {
            System.out.println("Bienvenido al sistema");
        } else if (user.equals(validUser) && !password.equals(validPassword)) {
            System.out.println("Parece que has olvidado tu contraseña");
        } else if (!user.equals(validUser) && password.equals(validPassword)) {
            System.out.println("Revisa por favor tus credenciales");
        } else {
            System.out.println("ACCESO DENEGADO!");
        }
        Login.close();
    }
}
