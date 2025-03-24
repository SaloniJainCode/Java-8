package org.example;

import java.util.Arrays;
import java.util.List;

// 5) How do you sort the given list of decimals in reverse order?

public class ReverseDecimalList {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.sort((x,y) -> (int) (y-x));
        System.out.println(decimalList);
    }
}
