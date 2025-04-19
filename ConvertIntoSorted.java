package org.example.stream;

//Convert a list of strings into a single comma-separated string, sorted alphabetically.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntoSorted {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Saloni","Jain","Welcome");
        String output = input.stream().sorted().collect(Collectors.joining(","));
        System.out.println(output);
    }
}
