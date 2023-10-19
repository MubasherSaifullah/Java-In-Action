package mushi.main.runner.java9.intefaceChangings;

import java.util.List;

public class ImmutableCollections {
    public static void main(String[] args) {
        // Create an immutable list of Strings.
        List<String> list = List.of("Hello", "World!");

        // Try to add an element to the list.
        list.add("!");

        // This will throw an UnsupportedOperationException.
    }

}
