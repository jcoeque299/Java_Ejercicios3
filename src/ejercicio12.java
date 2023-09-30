import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("¿Cuantos terminos de la seria de Fibonacci quieres ver?: ");
        int terminos = Integer.parseInt(lectura.next());

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < terminos; i++) {
            System.out.print(num1 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }
}
