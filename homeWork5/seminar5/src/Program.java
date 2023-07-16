import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Program {

    static Random ran = new Random();

    public static void main(String[] args) {

        HashMap<String, List<Contact>> bigBase = task(data);
        printDataBase(bigBase);
        //add("Сидоров", "+79112255698", bigBase);
        //printDataBase(bigBase);
        //get("Фокин", bigBase);

    }

    static String[] data = {
            "Григорьев +79997140586",
            "Фокин +79996811529",
            "Шестаков +79999462816",
            "Фокин +79994093705",
            "Шубин +79992598567",
            "Гущина +79054814815",
            "Брагина +79994814815",
            "Афанасьева +79212598567",
            "Рыбакова +79991372939",
            "Лазарева +79998546727",
            "Бирюков +79996330116",
            "Копылов +79998885566",
            "Горбунов +79994922223",
            "Лыткин +79999929362",
            "Соколов +79998541676"
    };

    public static HashMap<String, List<Contact>> task(String[] data) {

        HashMap<String, List<Contact>> base = new HashMap<>();
        for (String r : data) {
            String[] dataParts = r.split(" ");
            String name = dataParts[0];
            String num = dataParts[1];
            Contact contact = new Contact(name, num);
            if (base.containsKey(name)) {
                base.get(name).add(contact);
            } else {
                List<Contact> temp = new ArrayList<>();
                temp.add(contact);
                base.put(name, temp);
            }
        }
        return base;
    }

    public static void printDataBase(HashMap<String, List<Contact>> base) {

        for (Map.Entry<String, List<Contact>> i : base.entrySet()) {
            System.out.println(i.getKey() + ":");

            for (Contact contact : i.getValue()) {
                System.out.println("\t" + contact);
            }
        }
    }

    public static void add(String name, String number, HashMap<String, List<Contact>> base) {
        Contact contact = new Contact(name, number);
        if (base.containsKey(name)) {
            base.get(name).add(contact);
        } else {
            List<Contact> temp = new ArrayList<>();
            temp.add(contact);
            base.put(name, temp);
        }
    }

    public static void get(String name, HashMap<String, List<Contact>> base) {
        if (base.containsKey(name)) {
            
            //for (Map.Entry<String, List<Contact>> i : base.entrySet()) {
            System.out.printf("По имени: " + name + "\nНайдено: " + base.get(name));
        } else {
            System.out.printf("В нашей базе нет контактов с именем: " + name);
        }
    }
}