import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio21 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        int numero = parseInt(userInput.nextLine());
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        int sumaNumerosImpares = 0;
        int maxNumeroPar = -1;
        while(numero >= 0) {
            numeros.add(numero);
            if (numero %2== 0 && (numero > maxNumeroPar)) {
                maxNumeroPar=numero;
            }
            else {
                numerosImpares.add(numero);
            }
            userInput = new Scanner(System.in);
            System.out.println("Introduzca numero");
            numero = parseInt(userInput.nextLine());
        }
        for (int numeroImpar: numerosImpares) {
            sumaNumerosImpares += numeroImpar;
        }
        System.out.println("Se han introducido " + numeros.size() + " numeros");
        if (numerosImpares.isEmpty()) {
            System.out.println("No se han introducido numeros impares");
        }
        else {
            System.out.println("La media de los numeros impares es " + sumaNumerosImpares/numerosImpares.size());
        }
        if (maxNumeroPar < 0) {
            System.out.println("No se han introducido numeros pares");
        }
        else {
            System.out.println("El numero par mas grande es " + maxNumeroPar);
        }
    }
}
