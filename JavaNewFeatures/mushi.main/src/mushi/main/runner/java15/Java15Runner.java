package mushi.main.runner.java15;

public class Java15Runner {
    public record PersonRecord(String name, int age) {
    }
    public static void main(String[] args) {

        Person person = new Person("Sarim", 55);
        System.out.println("""
                Printing the Person Object with Person Class %s
                """.formatted(person.toString()));

        PersonRecord personRecord = new PersonRecord("Sarim", 55);
        System.out.println("""
                Printing the Person Object created with Person Record %s
                """.formatted(personRecord.toString()));

    }
}
