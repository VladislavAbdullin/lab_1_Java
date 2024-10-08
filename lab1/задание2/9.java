

import java.util.Scanner;

public class Main {

    public String day(int x) {
        String result; // Объявляем переменную для результата
        
        switch (x) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                result = "это не день недели"; 
                break;
        }
        return result; 
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
      
        String day = main.day(x); 

        System.out.println("Результат: " + day); 

        scanner.close(); // Закрываем сканер
    }
}
