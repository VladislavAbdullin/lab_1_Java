import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    // Задание 1: дробная часть числа
    public double fraction(double x) {
        return x - (int) x;
    }

    // Задание 2: преобразование символа в число
    public int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return x - '0';
        }
        throw new IllegalArgumentException("Входной символ не является цифрой.");
    }

    // Задание 3: проверка двузначного числа
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    // Задание 4: проверка диапазона
    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return num >= a && num <= b;
    }

    // Задание 5: проверка равенства трёх чисел
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 6: абсолютное значение
    public int abs(int x) {
       return Math.abs(x);
    }

    // Задание 7: проверка делимости на 3 или 5
    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    // Задание 8: нахождение максимального числа
    public int max3(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y > z) {
                return y;
            } else {
                return z;
            }
        }
    }

    // Задание 9: сумма двух чисел
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Задание 10: день недели
    public String day(int x) {
        String result;
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

    // Задание 11: вывод чисел от 0 до x
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 12: вывод четных чисел от 0 до x
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i < x - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 13: количество цифр в числе
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

    // Задание 14: вывод квадрата из звездочек
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Задание 15: вывод прямоугольного треугольника из звездочек
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

// Задание 16: поиск первого вхождения элемента в массиве
public int findFirst(int[] arr, int x) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1;
}

public int[] add(int[] arr, int[] ins, int pos) {
    int[] result = new int[arr.length + ins.length];
    for (int i = 0; i < pos; i++) {
        result[i] = arr[i];
    }
    for (int i = 0; i < ins.length; i++) {
        result[pos + i] = ins[i];
    }
    for (int i = pos; i < arr.length; i++) {
        result[ins.length + i] = arr[i];
    }
    return result;
}
    // Задание 18: нахождение максимального по модулю значения в массиве
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

// Задание 19: реверс массива
public static int[] reverseBack(int[] arr) {
    int[] reversedArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        reversedArr[i] = arr[arr.length - i - 1];
    }
    return reversedArr;
}

// Задание 20: поиск всех вхождений элемента в массиве
public static int[] findAll(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            count++;
        }
    }
    int[] indices = new int[count];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            indices[j] = i;
            j++;
        }
    }
    return indices;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Main main = new Main();

    while (true) {
        System.out.println("Выберите задание:");
        System.out.println("1. Дробная часть числа");
        System.out.println("2. Преобразование символа в число");
        System.out.println("3. Проверка двузначного числа");
        System.out.println("4. Проверка диапазона");
        System.out.println("5. Проверка равенства трёх чисел");
        System.out.println("6. Абсолютное значение");
        System.out.println("7. Проверка делимости на 3 или 5");
        System.out.println("8. Нахождение максимального числа");
        System.out.println("9. Сумма двух чисел");
        System.out.println("10. День недели");
        System.out.println("11. Вывод чисел от 0 до x");
        System.out.println("12. Вывод четных чисел от 0 до x");
        System.out.println("13. Количество цифр в числе");
        System.out.println("14. Вывод квадрата из звездочек");
        System.out.println("15. Вывод прямоугольного треугольника из звездочек");
        System.out.println("16. Поиск первого вхождения элемента в массиве");
            System.out.println("17. Вставка массива в другой массив");
            System.out.println("18. Нахождение максимального по модулю значения в массиве");
            System.out.println("19. Реверс массива");
            System.out.println("20. Поиск всех вхождений элемента в массиве");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите число:");
                    double num = scanner.nextDouble();
                    double fractionPart = main.fraction(num);
                    DecimalFormat df = new DecimalFormat("0.00");
                    System.out.printf("Дробная часть числа: %s%n", df.format(fractionPart));
                    break;
                case 2:
                    System.out.println("Введите символ:");
                    char ch = scanner.next().charAt(0);
                    System.out.println("Число, соответствующее символу: " + main.charToNum(ch));
                    break;
                case 3:
                    System.out.println("Введите число:");
                    int num2 = scanner.nextInt();
                   
                    
                      if (main.is2Digits(num2)) {
                        System.out.println("Число " + num2 + " является двузначным.");
                    } else {
                        System.out.println("Число " + num2 + " не является двузначным.");
                    }
                    
                    break;
                    case 4:
                    System.out.print("Введите левую границу: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите правую границу: ");
                    int b = scanner.nextInt();
                    System.out.print("Введите число: ");
                    int inputNum = scanner.nextInt(); 
                            
                    boolean isInRange = main.isInRange(a, b, inputNum);
                    
                    if (isInRange) {
                        System.out.println("Число " + inputNum + " входит в указанный диапазон.");
                    } else {
                        System.out.println("Число " + inputNum + " не входит в указанный диапазон.");
                    }
                    break;
                case 5:
                    System.out.println("Введите первое число:");
                    int x = scanner.nextInt();
                    System.out.println("Введите второе число:");
                    int y = scanner.nextInt();
                    System.out.println("Введите третье число:");
                    int z = scanner.nextInt();
                     boolean isEqual = main.isEqual(x, y, z);
                    if (main.isEqual(x, y, z)) {
            System.out.println("Все три числа равны.");
        } else {
            System.out.println("Не все три числа равны.");
        }
                    break;
                case 6:
                    System.out.print("Введите число: ");
                    int x9 = scanner.nextInt();
                    
                    if (x9 >= 0) {  // Проверка на положительность
                        System.out.println("Число положительное.");
                    } else {
                        System.out.println("Число отрицательное.");
                    }
  
                    break;
                case 7:
                    System.out.println("Введите число:");
                    int num5 = scanner.nextInt();
                    System.out.println("Число делится на 3 или 5: " + main.is35(num5));
                    break;
                case 8:
                     // Считываем три числа
        System.out.print("Введите первое число: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y1 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z1 = scanner.nextInt();

     
        int max3 = main.max3(x1, y1, z1);

        System.out.println("Максимальное число: " + max3);
                    break;
                case 9:
                   
                    
                       System.out.print("Введите первое число: ");
                        int x2 = scanner.nextInt();
                        System.out.print("Введите второе число: ");
                        int y2 = scanner.nextInt();
                
                       
                        int sum2 = main.sum2(x2, y2);

        System.out.println("Результат: " + sum2);
                    break;
                case 10:
                    System.out.println("Введите день недели:");
                    int dayNum = scanner.nextInt();
                    System.out.println("День недели: " + main.day(dayNum));
                    break;
                case 11:
                    System.out.println("Введите число:");
                    int num6 = scanner.nextInt();
                    System.out.println("Числа от 0 до " + num6 + ": " + main.listNums(num6));
                    break;
                case 12:
                    System.out.println("Введите число:");
                    int num7 = scanner.nextInt();
                    System.out.println("Четные числа от 0 до " + num7 + ": " + main.chet(num7));
                    break;
                case 13:
                    System.out.println("Введите число:");
                    long num8 = scanner.nextLong();
                    System.out.println("Количество цифр в числе: " + main.numLen(num8));
                    break;
                case 14:
                    System.out.println("Введите размер квадрата:");
                    int size = scanner.nextInt();
                    main.square(size);
                    break;
                case 15:
                    System.out.println("Введите размер треугольника:");
                    int size2 = scanner.nextInt();
                    main.rightTriangle(size2);
                    break;
                case 16:
                  
                    System.out.print("Введите размер массива: ");
                    int size9 = scanner.nextInt();
                    
                    int[] arr = new int[size9];
                    System.out.println("Введите элементы массива:");
                    
                    for (int i = 0; i < size9; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    
                    System.out.print("Введите число для поиска: ");
                    int x12 = scanner.nextInt(); 
                    
                   
                    int index = main.findFirst(arr, x12); 
                    
                    if (index != -1) {
                        System.out.println("Индекс первого вхождения: " + index); 
                    } else {
                        System.out.println("Элемент не найден в массиве."); 
                    }
                    
                    break;
                case 17:
                System.out.print("Введите элементы первого массива (через пробел): ");
                String[] arrInput = scanner.nextLine().split(" ");
                int[] arr12 = new int[arrInput.length];
                
                for (int i = 0; i < arrInput.length; i++) {
                    if (!arrInput[i].isEmpty()) {
                        arr12[i] = Integer.parseInt(arrInput[i]);
                    }
                }
                
                // Вводим второй массив
                System.out.print("Введите элементы второго массива (через пробел): ");
                String[] insInput = scanner.nextLine().split(" ");
                int[] ins = new int[insInput.length];
                
                for (int i = 0; i < insInput.length; i++) {
                    if (!insInput[i].isEmpty()) {
                        ins[i] = Integer.parseInt(insInput[i]);
                    }
                }
                
                // Вводим позицию
                System.out.print("Введите позицию для вставки: ");
                int pos = scanner.nextInt();
                scanner.nextLine(); // Добавьте это для очистки буфера
            
                // Проверка корректности позиции
                if (pos < 0 || pos > arr12.length) {
                    System.out.println("Ошибка: позиция должна быть в пределах от 0 до " + arr12.length);
                    return;
                }
            
                // Вызываем метод и выводим результат
               
                int[] result = main.add(arr12, ins, pos);
                System.out.print("Результат: [");
                
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i < result.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]"); // Выводим результат
                break;
            case 18:
                   System.out.print("Введите размер массива: ");
                    int size13 = scanner.nextInt();
            
                    int[] arr13 = new int[size13];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size13; i++) {
                        arr13[i] = scanner.nextInt();
                    }
            
                  
                    int maxValue = main.maxAbs(arr13);
                    System.out.println("Наибольшее по модулю значение: " + maxValue);
                break;
            case 19:
                 System.out.print("Введите количество элементов массива: ");
                int n = scanner.nextInt();
                int[] arr14 = new int[n];
                System.out.println("Введите массив:");
                for (int i = 0; i < n; i++) {
                    arr14[i] = scanner.nextInt();
                }
                int[] reversedArr = reverseBack(arr14);
                System.out.print(": ");
                for (int i : reversedArr) {
                    System.out.print(i + " ");
                }
                break;
            case 20:
                System.out.print("Введите количество элементов массива: ");
        int n1 = scanner.nextInt();
        int[] arr15 = new int[n1];
        System.out.println("Введите массив:");
        for (int i = 0; i < n1; i++) {
            arr15[i] = scanner.nextInt();
        }
        System.out.print("Введите число x: ");
        int x66 = scanner.nextInt();
        int[] indices = findAll(arr15, x66);
        System.out.print("результат " + x66 + ": ");
        for (int i : indices) {
            System.out.print(i + " ");
        }
                break;
            default:
                System.out.println("Неверный выбор задания");
        }
    }
}
}
