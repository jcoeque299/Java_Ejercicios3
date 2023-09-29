import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio19 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca altura de la piramide");
        int altura = parseInt(userInput.nextLine());
        int espacios = altura;
        userInput = new Scanner(System.in);
        System.out.println("Introduzca caracter con el que hacer la piramide");
        String caracter = userInput.nextLine();
        for (int cont = 1; cont<1+(altura*2); cont = cont+2){
            System.out.println(" ".repeat(espacios)+caracter.repeat(cont));
            espacios = espacios-1;
        }
    }
}
