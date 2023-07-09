import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    /*
     * Задание
     * Пусть дан произвольный список целых чисел.
     * 1) Нужно удалить из него чётные числа
     * 2) Найти минимальное значение
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     */

    static Random r = new Random();

    public static void main(String[] args) {

        task();

    }

    static void task() {

        int size = r.nextInt(10, 41);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(-100, 101));
        }

        System.out.println("Сгенерированный список: " + list);

        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            }
        }

        ArrayList<Integer> listWithoutEven = new ArrayList<>(list);
        listWithoutEven.removeAll(even);
        System.out.println("Список без чётных: " + listWithoutEven);

        int min = list.get(0);
        for (Integer el : list) {
            if (el < min) {
                min = el;
            }
        }
        System.out.println("Минимальное значение первоначального списка : " + min);

        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        System.out.println("Максимальное значение первоначального списка : " + max);

    }

}
