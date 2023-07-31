import java.util.Objects;

public class Cat {
    
    String race;
    String name;
    String color;
    int age;
    double height;


@Override
public String toString() {
    return String.format("Порода: %s\tИмя: %s\nЦвет: %s\tВозраст: %d\tВысота: %.1f\n", race, name, color, age, height);
}

public Cat(String race, String name, String color, int age, Double height){
    this.race = race;
    this.name = name;
    this.color = color;
    this.age = age;
    this.height = height;
}

@Override
public boolean equals(Object o) {
    Cat cat = (Cat) o;
    return race == cat.race && name == cat.name && color == cat.color && age == cat.age && height == cat.height;
}


@Override
public int hashCode() {
        return Objects.hash(race, name, color, age, height);
    }

}
