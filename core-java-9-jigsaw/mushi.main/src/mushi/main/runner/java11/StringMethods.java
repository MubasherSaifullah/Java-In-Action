package mushi.main.runner.java11;

public class StringMethods {
    public static void main(String[] args) {
        // Create a string.
        String textforLines = "  Spring \n Boot ";
        String text = "  Spring Boot ";

        System.out.println(textforLines
                .lines()
                .toList());

        System.out.println(text.strip().replace(" ", "@"));
        System.out.println(text.stripLeading().replace(" ", "@"));
        System.out.println(text.stripIndent().replace(" ", "@"));
        System.out.println(text.stripTrailing().replace(" ", "@"));
        System.out.println(text.repeat(2));
    }
}
