package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

public class PrefixAndSuffix {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String output = input.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(output);
    }
}
