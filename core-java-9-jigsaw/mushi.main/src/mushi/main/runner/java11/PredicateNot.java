package mushi.main.runner.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin", " ", "C++");
        List<String> withoutBlanks = new ArrayList<>();

        /**
         * Before Java 11
         * */
        sampleList
                .stream()
                .filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.isBlank();
            }
        }).forEach(withoutBlanks::add);

        /**
         * After Java 11
         * */
        withoutBlanks = sampleList.
                stream().
                filter(Predicate.not(String::isBlank)).toList();


        System.out.println(Arrays.toString(withoutBlanks.toArray()));

        System.out.println(Arrays.toString(withoutBlanks.toArray()));
    }
}
