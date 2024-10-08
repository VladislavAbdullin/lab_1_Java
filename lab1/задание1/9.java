
import java.util.Scanner;

public class Main {

    public boolean isEqual(int a, int b, int c) {
        // Проверяем, равны ли все три числа
        return a == b && b == c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем три числа
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        Main main = new Main();
        boolean isEqual = main.isEqual(a, b, c);

        if (isEqual) {
            System.out.println("Все три числа равны.");
        } else {
            System.out.println("Не все три числа равны.");
        }

        scanner.close(); // Закрываем сканер
    }
}
