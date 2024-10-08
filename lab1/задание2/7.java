
import java.util.Scanner;

public class Main {

    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем три числа
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        Main main = new Main();
        int sum2 = main.sum2(x, y);

        System.out.println("Результат: " + sum2);

        scanner.close(); // Закрываем сканер
    }
}
