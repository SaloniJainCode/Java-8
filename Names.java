package org.example.stream;

//Print all names that have more than 4 characters.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Saloni","James","Joe");
        List<String> output = names.stream().filter(name->name.length() > 4).collect(Collectors.toList());
        System.out.println(output);
    }
}
