package org.example.stream;

//Q2. Filter even numbers from a list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,5,7,4,5,8,10);
        List<Integer> even = input.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}
