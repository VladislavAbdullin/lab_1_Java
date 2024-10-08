
import java.util.Scanner;

public class Main {

    public static boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        boolean is35 = is35(x);

        if (is35) {
            System.out.println("Число " + x + " делится нацело на 3 или 5.");
        } else {
            System.out.println("Число " + x + " не делится нацело на 3 или 5.");
        }

        scanner.close(); // Закрываем сканер
    }
}


