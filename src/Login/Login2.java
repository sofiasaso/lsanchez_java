package Login;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) throws Exception{
        Scanner Login2 = new Scanner(System.in);
        System.out.println("Bienvenido a Login.");
        System.out.println("Por favor, verifica tus datos correspondientes");

        //Variable declarada boolean
        boolean datosCorrectos = false;


        //Mientras los datos NO sean correctos
        while (!datosCorrectos){
            System.out.println("Ingrese su usuario por favor: ");
            String user;
            user = Login2.nextLine();
            System.out.println("Ingresa tu contraseña por favor");
            String password;
            password = Login2.nextLine();

            if ((user=="admin") && (password=="123")) {
                System.out.println("Bienvenido al sistema");
                datosCorrectos = true;
            } else {
                //System.out.println("jaja");
            }
        } 
        Login2.close();
}
}