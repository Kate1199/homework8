package academy.belhard;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ". Адрес: " + address.getCity() + ", улица " +
                address.getStreet() + " " + address.getHouseNumber() + "\n";
    }

    public int compareTo(Person p) {
        return address.getHouseNumber() - (p.address).getHouseNumber();
    }
}
