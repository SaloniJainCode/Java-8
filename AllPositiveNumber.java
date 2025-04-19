package org.example.stream;

//Check if all numbers are positive.

import java.util.Arrays;
import java.util.List;

public class AllPositiveNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,8,9,3,7,-1);
        boolean output = input.stream().allMatch(x->x>0);
        System.out.println(output);
    }
}
