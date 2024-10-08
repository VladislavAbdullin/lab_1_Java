

import java.util.Scanner;

public class Main {

    public int charToNum(char x) {
        // Проверяем, является ли символ цифрой
        if (x >= '0' && x <= '9') {
            return x - '0'; // Преобразуем символ в соответствующее число
        }
        throw new IllegalArgumentException("Входной символ не является цифрой.");
    }

    public static void main(String[] args) {
        Main converter = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String input = scanner.nextLine(); // Считываем строку

        if (input.length() > 0) {
            char inputChar = input.charAt(0); // Берем первый символ
            try {
                int number = converter.charToNum(inputChar);
                System.out.println("Преобразованный символ '" + inputChar + "' в число: " + number);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Вы не ввели ни одного символа.");
        }

        scanner.close(); // Закрываем сканер
    }
}