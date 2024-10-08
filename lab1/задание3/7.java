
import java.util.Scanner;

public class Main {

    public void square(int x) {
        for (int i = 0; i < x; i++) { 
            for (int j = 0; j < x; j++) { 
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

        main.square(x); 
        
        scanner.close(); 
    }
}
