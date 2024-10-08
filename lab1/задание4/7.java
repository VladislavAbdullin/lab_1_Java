
import java.util.Scanner;

public class Main {
    public static int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;
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
        int[] reversedArr = reverseBack(arr);
        System.out.print(": ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }
}