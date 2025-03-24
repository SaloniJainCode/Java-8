package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3) How do you find frequency of each character in a string using Java 8 streams?

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "HelloWorld";
        Map<Character,Long> output = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(output);
    }
}
