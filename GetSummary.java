package org.example.stream;

import java.util.*;

// Given a list of integers, return a summary (min, max, average, sum, count).

public class GetSummary {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,4,8,7,5,0,8,9);
         IntSummaryStatistics stats = input.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Count: "+stats.getCount());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Sum: "+stats.getSum());
    }
}
