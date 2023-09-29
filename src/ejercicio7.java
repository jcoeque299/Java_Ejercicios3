import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio7 {
    public static void main(String[] args){
        int cajaFuerte = 9999;
        int intentos = 4;
        while(intentos > 0) {
            Scanner numeroInput = new Scanner(System.in);
            System.out.println("Introduzca combinacion de caja fuerte");
            int numero = parseInt(numeroInput.nextLine());
            if (numero == cajaFuerte) {
                System.out.println("Has abierto la caja fuerte");
                break;
            }
            else {
                intentos = intentos-1;
                System.out.println("Combinacion incorrecta. Quedan " + intentos + " intentos");
            }
        }
    }
}
