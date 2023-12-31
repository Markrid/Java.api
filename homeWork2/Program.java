import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Program{

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args)throws IOException{
        
        //task1(); // Улучшенный калькулятор
        task2(); // Сортировка пузырьком с записью в файл

        
    }        
        
          
               
        static void task1() throws IOException{

            File log = new File("log.txt");
            FileWriter fw = new FileWriter(log, true);

        System.out.println("Добро пожаловать в калькулятор c историей вычислений");
        boolean f = true;
        while (f) {
            
            System.out.println("Что делаем?\n\t1 - вычисляем;\n\t2 - выход;");
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
                    fw.write(new Date() + "Вычисляем: " + a + " + " + b + " = " + res1 + "\n");
                    break;
                case 2:
                    int res2 = a - b;
                    System.out.printf("Разность %d и %d равна %d \n", a, b, res2);
                    fw.write(new Date() + " Вычисляем: " + a + " - " + b + " = " + res2 + "\n");
                    break;
                case 3:
                    double number1 = a;
                    double number2 = b;
                    double res3 = number1 / number2;
                    System.out.printf("%.0f разделить на %.0f равно %.2f \n", number1, number2, res3);
                    fw.write(new Date() + " Вычисляем: " + number1 + " / " + number2 + " = " + res3 + "\n");
                    break;
                case 4:
                    int res4 = a * b;
                    System.out.printf("Произедение %d и %d равно %d \n", a, b, res4);
                    fw.write(new Date() + " Вычисляем: " + a + " * " + b + " = " + res4 + "\n");
                    break;
            }
            fw.flush();
            }
            else {
                fw.close();
                f = false;
            }
        }
    }

    static void task2() throws IOException{

            File logSort = new File("logSort.txt");
            FileWriter fileW = new FileWriter(logSort, true);

        System.out.println("Будем сортировать");
  
        int[] array = new int[random.nextInt(10,21)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,30);
        }

        System.out.println("Сгенерированный массив :" + Arrays.toString(array));
        int size = array.length;
        int temp;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                if (array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            }
            fileW.write(Arrays.toString(array)+"\n");
            fileW.flush();
        }
        fileW.close();
        System.out.println("Итог :" + Arrays.toString(array));
    }

}