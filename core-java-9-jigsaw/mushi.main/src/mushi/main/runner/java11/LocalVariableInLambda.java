package mushi.main.runner.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalVariableInLambda {
    public static void main(String[] args) {
        // Create a list of strings.
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");

        // Before Java 11
        list.sort((String s1, String s2) -> s1.length() - s2.length());

        // After Java 11
        list.sort((var s1, var s2) -> s1.length() - s2.length());

        // Print the sorted list.
        System.out.println(Arrays.toString(list.toArray()));
    }
}
