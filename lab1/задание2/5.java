
import java.util.Scanner;

public class Main {

    public int max3(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y > z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем три числа
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        Main main = new Main();
        int max3 = main.max3(x, y, z);

        System.out.println("Максимальное число: " + max3);

        scanner.close(); // Закрываем сканер
    }
}
