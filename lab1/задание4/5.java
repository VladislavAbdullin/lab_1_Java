
import java.util.Scanner;

public class Main {

    public int maxAbs(int[] arr) {
        if (arr.length == 0) {
            return 0; 
        }
        
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i]; 
            }
        }

        return max; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt(); 
        }
        
        Main main = new Main();
        int maxValue = main.maxAbs(arr); 
        System.out.println("Наибольшее по модулю значение: " + maxValue); 
        
        scanner.close(); 
    }
}