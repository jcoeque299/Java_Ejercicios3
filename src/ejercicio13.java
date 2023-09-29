import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio13 {
    public static void main(String[] args){
        int positivos = 0;
        int negativos = 0;
        Scanner numerosInput = new Scanner(System.in);
        System.out.println("Introduzca numero");
        String numeros = numerosInput.nextLine();
        String[] numerosList = numeros.replaceAll("\\s+","").split(",");
        for(String numero: numerosList) {
            if (parseInt(numero) < 0) {
                negativos+=1;
            }
            else {
                positivos+=1;
            }
        }
        System.out.println("Hay " + positivos + " numeros positivos y " + negativos + " numeros negativos");
    }
}
