
import java.util.Scanner;
public class Main {

    public String listNums(int x) {
        StringBuilder  result = new StringBuilder ();
        
        for (int i = 0; i <= x; i++) {
            result.append(i); 
            if (i < x) { 
                result.append(" ");
            }
        }
        
        return result.toString(); 
    }
    
    public static void main(String[] args) {
        Main main = new Main();
       Scanner scanner = new Scanner(System.in);
      
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        String numbers = main.listNums(x);
        System.out.println("Результат: " + numbers); // Выводим результат
    }
}