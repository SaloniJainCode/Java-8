package org.example;

//9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String[] args) {
        int[] input1 = new int[] {1,4,2,8,3};
        int[] input2 = new int[] {9,3,7,1,3};
        int[] output = IntStream.concat(Arrays.stream(input1),Arrays.stream(input2)).sorted().toArray();
        System.out.println(Arrays.toString(output));
    }
}
