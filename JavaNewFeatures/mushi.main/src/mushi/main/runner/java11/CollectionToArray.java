package mushi.main.runner.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Carol");
        /**
         *  ================ In Java 10 ================
         * */
        // Create a new array of strings to store the elements of the list
        String[] namesArray = new String[names.size()];

        // Copy the elements of the list to the array
        for (int i = 0; i < names.size(); i++) {
            namesArray[i] = names.get(i);
        }
        // Print the elements of the array
        for (String name : namesArray) {
            System.out.println(name);
        }

        /**
         *  ================ In Java 11 ================
         * */
        // Convert the collection to an array of Strings.
        String[] array = names.toArray(String[]::new);
        // Print the contents of the array.
        System.out.println(Arrays.toString(array));
    }
}
