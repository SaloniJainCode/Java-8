package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of integers, find maximum and minimum of those numbers?

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,6,4,2,4,7,9,23,55,56);
        int max = input.stream().max(Comparator.naturalOrder()).get();
        int min = input.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max = "+max+" Min = "+min);
    }
}
