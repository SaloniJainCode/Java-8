package org.example.stream;

//Convert a list of strings to their lengths.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertToLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Saloni","Jain","Hello","World");
        List<Integer> output = input.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println(output);
    }
}
