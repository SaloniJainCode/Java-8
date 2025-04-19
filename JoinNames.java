package org.example.stream;

//Join all names into a single string, separated by commas.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        String output = names.stream().collect(Collectors.joining(","));
        System.out.println(output);
    }
}
