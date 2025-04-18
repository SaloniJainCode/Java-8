package org.example.stream;

// Print each element with its index.

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ElementWithIndex {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("A","B","C","D");
        IntStream.range(0,input.size()).forEach(i-> System.out.println(input.get(i)+" : "+i));
    }
}
