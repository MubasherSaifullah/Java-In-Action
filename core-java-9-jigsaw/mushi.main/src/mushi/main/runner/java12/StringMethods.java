package mushi.main.runner.java12;

public class StringMethods {
    public static void main(String[] args) {
        // Create a string.
        String text = "Spring.\n Boot";

        // Before Java 12
//        System.out.println("
//        \t\t\t\t\t\t\t\t\t\t" + text);

        // Indent the text by 4 spaces.
        String indentedText = text.indent(4);

        // Transform the text to all uppercase.
        String uppercaseText = text.transform(String::toUpperCase);

        // Print the indented and transformed text.
        System.out.println(indentedText);
        System.out.println(uppercaseText);
    }
}
