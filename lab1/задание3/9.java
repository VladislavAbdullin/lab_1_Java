
import java.util.Scanner;

public class Main {

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) { 
            
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        main.rightTriangle(x); 
        
        scanner.close(); 
    }
}
