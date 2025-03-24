package org.example;

//How do you remove duplicate elements from a list using Java 8 streams?

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,1,3,4,4,9,7);
        list.stream().distinct().forEach(System.out::println);
    }
}
