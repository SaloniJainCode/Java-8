package org.example.stream;

//Count how many numbers are greater than 10.

import java.util.Arrays;
import java.util.List;

public class CountNumbers {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,12,23,20,1,23,43);
        long count = input.stream().filter(x->x>10).count();
        System.out.println(count);
    }
}
