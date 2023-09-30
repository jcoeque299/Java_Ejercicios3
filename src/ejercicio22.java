import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio22 {
    public static boolean numPrimo(int num) {
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            if (numPrimo(num)) {
                System.out.print(num + " ");
            }
        }
    }
}