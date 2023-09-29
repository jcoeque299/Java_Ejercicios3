import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio9 {
    public static void main(String[] args){
        Scanner numeroInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        Integer numero = parseInt(numeroInput.nextLine());
        System.out.println(numero.toString().length());
    }
}
