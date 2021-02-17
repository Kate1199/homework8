package academy.belhard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Address a1 = new Address("Минск", "Комонавтов", 45);
        Address a2 = new Address("Минск", "Я.Коласа", 18);
        Address a3 = new Address("Брест", "Советская", 24);

        Person p1 = new Person("Василий", "Калинин", a1);
        Person p2 = new Person("Анна", "Зубова", a3);
        Person p3 = new Person("Мария", "Виноградова", a2);
        Person p4 = new Person(null, "Симонов", a2);
        Person p5 = new Person("Михаил", null, a3);
        Person p6 = new Person("Даниил", "Беляев", null);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

      List<Person> stream = people
              .stream()
              .filter(x -> (x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null))
              .sorted()
              .collect(Collectors.toList());

        System.out.println(stream);


    }
}
