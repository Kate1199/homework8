package academy.belhard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Address a1 = new Address("Минск", "Независимости", 45);
        Address a2 = new Address("Минск", "Я.Коласа", 18);
        Address a3 = new Address("Брест", "Советская", 24);

        Person p1 = new Person("Василий", "Калинин", a1);
        Person p2 = new Person("Анна", "Зубова", a1);
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

      List<Person> result = people.stream()
               .filter(x -> !(x.getFirstName().equals(null)) || !(x.getLastName().equals(null)) || !(x.getAddress().equals(null)))
               .sorted()
               .collect(Collectors.toList());

       for(Person p : result) {
           System.out.println(p.toString());
       }
    }
}
