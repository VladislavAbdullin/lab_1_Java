

import java.util.Scanner;
public class Main {

    public int numLen(long x) {
        if (x == 0) {
            return 1; 
        }

        int len = 0;
        while (x != 0) {
            x /= 10; 
            len++; 
        }

        return len; 
    }
    
    public static void main(String[] args) {
        Main main = new Main();
       Scanner scanner = new Scanner(System.in);
      
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int numbers = main.numLen(x);
        System.out.println("Результат: " + numbers); // Выводим результат
    }
}