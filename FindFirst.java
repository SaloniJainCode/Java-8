package org.example.stream;

//Check if all numbers are positive

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,9,4,5,3);
        Optional<Integer> output = input.stream().filter(x-> x%3 == 0).findFirst();
        System.out.println(output.get());
    }
}
