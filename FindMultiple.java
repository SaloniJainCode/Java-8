package org.example;

// 7) From the given list of integers, print the numbers which are multiples of 5?

import java.util.Arrays;
import java.util.List;

public class FindMultiple {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,8,4,5,25,90,4,3,56);
        input.stream().filter(x->x%5==0).forEach(System.out::println);
    }
}
