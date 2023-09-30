import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = lectura.nextInt();
        System.out.print("Introduzca el carácter con el que hacer la pirámide: ");
        String caracter = lectura.next();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            System.out.print(caracter);

            if (i > 1 && i < altura) {
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);
            } else if (i == altura) {
                for (int k = 1; k < 2 * i - 1; k++) {
                    System.out.print(caracter);
                }
            }
            System.out.println();
        }
    }
}