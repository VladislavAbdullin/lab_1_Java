

import java.util.Scanner;

public class Main {

    public int abs(int x) {
        return Math.abs(x);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int abs = main.abs(x);

        if (abs > 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }

        scanner.close(); // Закрываем сканер
    }
}
