import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio11 {
    public static void main(String[] args){
        Scanner numeroInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        Integer numero = parseInt(numeroInput.nextLine());
        for (int cont = 0; cont <= 5; cont++) {
            System.out.println(numero+cont + " " + (numero+cont)*(numero+cont) + " " + (numero+cont)*(numero+cont)*(numero+cont));
        }
    }
}
