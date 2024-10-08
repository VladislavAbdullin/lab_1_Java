

import java.util.Scanner;

public class Main {
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[j] = i;
                j++;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите массив:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        int[] indices = findAll(arr, x);
        System.out.print("результат " + x + ": ");
        for (int i : indices) {
            System.out.print(i + " ");
        }
    }
}
