import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = Integer.parseInt(lectura.next());
        int cont = 1;
        while (cont <= 10) {
            int resultado = num * cont;
            System.out.println(num + " * " + cont + " = " + resultado);
            cont++;
        }
    }
}
