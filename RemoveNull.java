package org.example.stream;

//Remove all null or empty strings from a list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Saloni","",null,"Jain");
        List<String> output = input.stream().filter(x->x!=null && !x.isEmpty()).collect(Collectors.toList());
        System.out.println(output);
    }
}
