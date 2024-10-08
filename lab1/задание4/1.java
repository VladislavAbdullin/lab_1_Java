
import java.util.Scanner;

public class Main {

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { 
                return i; 
            }
        }
        return -1;
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
        
        System.out.print("Введите число для поиска: ");
        int x = scanner.nextInt(); 
        
        Main main = new Main();
        int index = main.findFirst(arr, x); 
        System.out.println("Индекс первого вхождения: " + index); 
        
        scanner.close(); // Закрываем сканер
    }
}
