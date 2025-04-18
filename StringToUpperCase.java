package org.example.stream;

////Q1. Convert a list of strings to uppercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StringToUpperCase {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("saloni","jain");
        List<String> output = input.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(output);
    }
}
