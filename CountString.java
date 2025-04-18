package org.example.stream;

//Q3. Count how many strings start with "A".

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Amount","Again","Name","Call");
        List<String> output = input.stream().filter(word -> word.startsWith("A")).collect(Collectors.toList());
        System.out.println(output);
        long count = input.stream().filter(name->name.startsWith("A")).count();
        System.out.println("Total words available: "+count);
    }
}
