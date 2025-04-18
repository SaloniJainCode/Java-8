package org.example.stream;

//Given a list of integers, square every number.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> output = input.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(output);
    }
}
