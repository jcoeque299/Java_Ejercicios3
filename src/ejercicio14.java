import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = Integer.parseInt(lectura.next());
        System.out.print("Introduzca el exponente: ");
        int exp = Integer.parseInt(lectura.next());

        int potencia = 1;

        while (exp >= 1) {
            potencia *= num;
            exp--;
        }

        System.out.println("El resultado de la potencia es: " + potencia);
    }
}
