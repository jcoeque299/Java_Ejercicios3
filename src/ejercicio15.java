import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio15 {
    public static void main(String[] args){
        Scanner numerosInput = new Scanner(System.in);
        System.out.println("Introduzca base");
        int base = parseInt(numerosInput.nextLine());
        numerosInput = new Scanner(System.in);
        System.out.println("Introduzca exponente");
        int expontente = parseInt(numerosInput.nextLine());
        for (int cont = 1; cont <= expontente; cont++) {
            System.out.println(base+"^"+cont);
        }
    }
}
