package org.example.stream;

//Check if any number is negative.

import java.util.Arrays;
import java.util.List;

public class CheckNegativeNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,8,7,-9,3);
        boolean output = input.stream().anyMatch(x->x<0);
        System.out.println(output);
    }
}
