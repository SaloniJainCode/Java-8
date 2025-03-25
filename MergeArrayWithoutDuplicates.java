package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeArrayWithoutDuplicates {
    public static void main(String[] args) {
        int[] input1 = new int[] {1,4,2,8,3};
        int[] input2 = new int[] {9,3,7,1,3};
        int[] output = IntStream.concat(Arrays.stream(input1) , Arrays.stream(input2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(output));
    }
}
