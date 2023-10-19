package mushi.main.runner.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {
    public static void main(String[] args) {
        // Create a list of strings representing integers.
        List<String> integersAsString = Arrays.asList("1", "2", "3");

        // Convert the list of strings to a list of integers using a stream.
        List<Integer> ints1 = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());

        // Convert the list of strings to a list of integers using a stream without collecting it.
        List<Integer> ints2 = integersAsString.stream().map(Integer::parseInt).toList();

        // Print the list of integers.
        System.out.println(ints1);
        System.out.println(ints2);
    }
}
