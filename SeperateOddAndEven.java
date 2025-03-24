package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

// 1) Given a list of integers, separate odd and even numbers?

public class SeperateOddAndEven {
    public static void main(String[] args) {
        System.out.println("Even Numbers");
        List<Integer> list = Arrays.asList(1,2,45,7,3,6,8,2);
        Map<Boolean,List<Integer>> answer = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even Numbers");
        answer.get(true).forEach(System.out::println);
        System.out.println("Odd Numbers");
        answer.get(false).forEach(System.out::println);
    }
}
