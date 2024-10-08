
import java.util.Scanner;

public class Main {
    
    public int[] add(int[] arr, int[] ins, int pos) {
        // Создание нового массива с учетом вставляемых элементов.
        int[] result = new int[arr.length + ins.length];
        
        // Копируем элементы из arr до позиции pos
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        
        // Вставляем элементы из ins
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        
        // Копируем оставшиеся элементы из arr
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }
        
        return result; // Возвращаем новый массив
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Main main = new Main();

        // Вводим первый массив
        System.out.print("Введите элементы первого массива (через пробел): ");
        String[] arrInput = scanner.nextLine().split(" ");
        int[] arr = new int[arrInput.length];
        for (int i = 0; i < arrInput.length; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }

        // Вводим второй массив
        System.out.print("Введите элементы второго массива (через пробел): ");
        String[] insInput = scanner.nextLine().split(" ");
        int[] ins = new int[insInput.length];
        for (int i = 0; i < insInput.length; i++) {
            ins[i] = Integer.parseInt(insInput[i]);
        }

        // Вводим позицию
        System.out.print("Введите позицию для вставки: ");
        int pos = scanner.nextInt();

        // Проверка корректности позиции
        if (pos < 0 || pos > arr.length) {
            System.out.println("Ошибка: позиция должна быть в пределах от 0 до " + arr.length);
            return;
        }

        // Вызываем метод и выводим результат
        int[] result = main.add(arr, ins, pos);
        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Выводим результат

        scanner.close(); // Закрываем сканер
    }
}