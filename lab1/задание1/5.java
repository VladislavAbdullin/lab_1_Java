
import java.util.Scanner;

public class Main {

    public boolean is2Digits(int x) {
        // Проверяем, находится ли число в диапазоне от 10 до 99 или от -99 до -10
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt(); // Считываем число

        Main main = new Main();
        boolean is2Digits = main.is2Digits(x);

        if (is2Digits) {
            System.out.println("Число " + x + " является двузначным.");
        } else {
            System.out.println("Число " + x + " не является двузначным.");
        }

        scanner.close(); // Закрываем сканер
    }
}