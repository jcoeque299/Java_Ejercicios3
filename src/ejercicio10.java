import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        double suma = 0;
        int cont = 0;

        System.out.println("Introduzca números positivos (negativo para terminar): ");

        while (true) {
            int num = Integer.parseInt(lectura.next());

            if (num < 0) {
                break;
            }
            suma += num;
            cont++;
        }

        if (cont > 0) {
            double media = suma/cont;
            System.out.println("La media de los " + cont + " numeros introducidos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}
