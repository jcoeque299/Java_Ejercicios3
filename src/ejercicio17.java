import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio17 {
    public static void main(String[] args){
        Scanner numerosInput = new Scanner(System.in);
        System.out.println("Introduzca numero positivo");
        int numero = parseInt(numerosInput.nextLine());
        if (numero < 0) {
            System.out.println("Debe ser un numero positivo");
        }
        else {
            for (int cont = numero; cont <= numero+100; cont++){
                System.out.println(cont);
            }
        }
    }
}
