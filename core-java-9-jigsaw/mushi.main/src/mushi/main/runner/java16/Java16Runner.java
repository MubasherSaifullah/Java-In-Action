package mushi.main.runner.java16;

public class Java16Runner {
    public static void main(String[] args) {
        record Person(String name, int age) {
            static record Address(String street, String city, String state) {}
            static Address address;
        }
        Person person = new Person("Alice", 25);
        // Create a new Address inner class instance.
        Person.Address address = new Person.Address("123 Main Street", "Anytown", "CA");
        // Set the person's address.
        person.address = address;
        // Print the person's name and address.
        System.out.println(person.name);
        System.out.println(person.address.street);
        System.out.println(person.address.city);
        System.out.println(person.address.state);
    }
}
