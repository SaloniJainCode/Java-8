package org.example.stream;

//Find the minimum number from a list.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,2,1,9,8,0,8,4);
        Optional<Integer> output = input.stream().min(Integer::compareTo);
        System.out.println(output.get());
    }
}
