

import java.util.Scanner;

public class Main {

    public boolean isInRange(int a, int b, int num) {
        // Сортируем значения a и b в порядке возрастания
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Проверяем, входит ли num в диапазон [a, b]
        return num >= a && num <= b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем границы диапазона и число
        System.out.print("Введите левую границу: ");
        int a = scanner.nextInt();
        System.out.print("Введите правую границу: ");
        int b = scanner.nextInt();
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        Main main = new Main();
        boolean isInRange = main.isInRange(a, b, num);

        if (isInRange) {
            System.out.println("Число " + num + " входит в указанный диапазон.");
        } else {
            System.out.println("Число " + num + " не входит в указанный диапазон.");
        }

        scanner.close(); // Закрываем сканер
    }
}
