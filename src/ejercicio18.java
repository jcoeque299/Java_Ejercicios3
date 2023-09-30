import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num1 = Integer.parseInt(lectura.next());
        System.out.print("Introduzca otro numero distinto: ");
        int num2 = Integer.parseInt(lectura.next());

        while (num1 == num2) {
            System.out.println("Los numeros no son distintos. Introduzca otro numero distinto: ");
            num2 = Integer.parseInt(lectura.next());
        }

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }
    }
}
