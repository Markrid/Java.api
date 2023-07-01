package homeWork1;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task2();

    }

    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
    static void task1() {

        System.out.println("Что будем вычислять?\n 1 - Треугольное число.\n 2 - Факториал.");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0 & number < 3) {
            if (number == 1) {
                System.out.println("Какое по счёту треугольное число вы бы хотели узнать?\nВведите значение: ");
                int value = Integer.parseInt(scanner.nextLine());
                Double temp = ((value * 0.5) * (value + 1));
                Integer res = temp.intValue();
                System.out.printf("Ваше число - %d", res);
            }
            if (number == 2) {
                System.out.println("Факториал какого числа вы хотите вычислить?\nВведите значение: ");
                int value = Integer.parseInt(scanner.nextLine());
                int result = 1;
                for (int i = 1; i < value+1; i++) {
                    result *= i;                  
                }

                System.out.printf("Факториал числа %d равен %d \n", value, result);
            }}
        else {
            System.out.println("Некорректное значение, попробуйте снова!");
        }
        }
        
    // 2) Вывести все простые числа от 1 до 1000
    static void task2() {

        System.out.println("Программа выводит все простые числа от 1 до 1000\nДля запуска нажмите Enter");
        scanner.nextLine();
        System.out.printf("2 3 ");
        boolean flag = true;
        for (int i = 4; i < 1001; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i / j == 0)
                flag = false;
                break;
            }
            if (flag == true)
            System.out.printf("%d ",i);
            }
        }
    
    
    
    
    
    
    }


    // 3) Реализовать простой калькулятор
    // 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
    // Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы
    // одно решение или сообщить, что его нет.
