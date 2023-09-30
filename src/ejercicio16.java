import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = Integer.parseInt(lectura.next());

        if (num <= 1) {
            System.out.println("El numero " + num + " no es primo");
        } else if (num <= 3) {
            System.out.println("El numero " + num + " es primo");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("El numero " + num + " no es primo");
                } else {
                    System.out.println("El numero " + num + " es primo");
                }
            }
        }
    }
}