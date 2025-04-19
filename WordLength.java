package org.example.stream;

//Given a list of words, return a map of word lengths.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Saloni","Jain");
        Map<String,Integer> output = input.stream().collect(Collectors.toMap(x->x,x->x.length()));
        System.out.println(output);
    }
}
