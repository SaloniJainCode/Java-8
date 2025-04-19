package org.example.stream;

//Count how many times each word appears in a list of strings.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Hello","Welcome","Saloni","Java","Hello");
        Map<String, Long> output = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(output);
    }
}
