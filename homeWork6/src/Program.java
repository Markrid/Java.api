import java.util.HashSet;

public class Program {

    public static void main(String[] args) {

        HashSet<Cat> data = new HashSet<Cat>();
        data.add(new Cat("Майн-кун", "Барсик", "серый", 5, 25.0));
        data.add(new Cat("Шотландская", "Снежок", "белый", 11, 23.2));
        data.add(new Cat("Британская", "Кешка", "чёрный", 3, 22.7));
        data.add(new Cat("Манчкин", "Персик", "песчанный", 9, 21.3));
        data.add(new Cat("Шотландская", "Снежок", "белый", 11, 23.2));

        System.out.println("Проверяем добавление всех элементов:\n" + data);

        Cat cat1 = new Cat("Бенгалец", "Матроскин", "коричневый", 4, 21.8);
        Cat cat2 = new Cat("Бенгалец", "Матроскин", "коричневый", 4, 21.8);
        System.out.println();
        // Используем переопределённый метод сравнения "equals"
        System.out.println(cat1.equals(cat2));

    }

}
