import java.util.Scanner;

public class Main {

    public double fraction(double x) {
        return x - (int) x; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main what = new Main();
        
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        
        double result = what.fraction(x);
        System.out.printf("Дробная часть числа %.2f: %.2f%n", x, result);
        
        scanner.close(); // Закрываем Scanner
    }
}
