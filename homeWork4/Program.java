import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws IOException {

        boolean q = true;
        while (q) {
            System.out.println(
                    "Выбирете задачу:\n\t1 - Заполняем и переворачиваем LinkedList.\n\t2 - Калькулятор (с отменой).\n\t3 - Выйти из программы");
            int no = Integer.parseInt(scanner.nextLine());
            switch (no) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    q = false;
                    break;
                default:
                    System.out.println("Вы ввели некорректное значение, попробуйте снова.");
                    break;
            }
        }
    }

    static void task1() {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Введите размер коллекции: ");
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(0, 100));
        }

        System.out.println("Создана коллекция - " + list);
        LinkedList<Integer> newList = rever(list);
        System.out.println("Перевернули - " + newList);
    }

    static LinkedList<Integer> rever(LinkedList<Integer> llist) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int j = llist.size() - 1; j >= 0; j--) {
            newList.add(llist.get(j));
        }
        return newList;

    }

    static void task2() throws IOException {

        File log = new File("log.txt");
        FileWriter fw = new FileWriter(log, true);
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Добро пожаловать в калькулятор c историей вычислений и возможностью отмены действия");
        boolean f = true;
        while (f) {

            System.out.println("Что делаем?\n\t1 - вычисляем;\n\t2 - выведи историю операций;\n\t3 - выход;");
            int q = Integer.parseInt(scanner.nextLine());

            if (q == 1) {
                System.out.println("Введите первое число: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Выбирете знак:\n\t1 - +\n\t2 - -\n\t3 - /\n\t4 - *");
                int z = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите второе число: ");
                int b = Integer.parseInt(scanner.nextLine());

                switch (z) {
                    case 1:
                        int res1 = a + b;
                        System.out.printf("Сумма %d и %d равна %d \n", a, b, res1);
                        fw.write(new Date() + " Вычисляем: " + a + " + " + b + " = " + res1 + "\n");
                        deque.push(a + " + " + b + " = " + res1);
                        break;
                    case 2:
                        int res2 = a - b;
                        System.out.printf("Разность %d и %d равна %d \n", a, b, res2);
                        fw.write(new Date() + " Вычисляем: " + a + " - " + b + " = " + res2 + "\n");
                        deque.push(a + " - " + b + " = " + res2);
                        break;
                    case 3:
                        double number1 = a;
                        double number2 = b;
                        double res3 = number1 / number2;
                        System.out.printf("%.0f разделить на %.0f равно %.2f \n", number1, number2, res3);
                        fw.write(new Date() + " Вычисляем: " + number1 + " / " + number2 + " = " + res3 + "\n");
                        deque.push(a + " / " + b + " = " + res3);
                        break;
                    case 4:
                        int res4 = a * b;
                        System.out.printf("Произедение %d и %d равно %d \n", a, b, res4);
                        fw.write(new Date() + " Вычисляем: " + a + " * " + b + " = " + res4 + "\n");
                        deque.push(a + " * " + b + " = " + res4);
                        break;
                }
                fw.flush();
            } else {
                if (q == 2) {
                    System.out.println("-----------------");
                    for (Object e : deque)
                        System.out.println(e);
                    boolean w = true;
                    while (w) {
                        System.out.println("\n\t1 - удалить последнюю операцию;\n\t2 - назад.");
                        int number = Integer.parseInt(scanner.nextLine());
                        if (number == 1) {
                            deque.pollFirst();
                            System.out.println("-----------------");
                            for (Object e : deque)
                                System.out.println(e);
                        } else {
                            w = false;
                        }
                    }
                }

                else {
                    fw.close();
                    f = false;
                }
            }
        }
    }
}
