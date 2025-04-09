package org.example;

import java.util.HashMap;
import java.util.Map;

public class SortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 22);
        ageMap.put("Charlie", 28);
        ageMap.put("Diana", 35);
        ageMap.put("Ethan", 27);
        ageMap.put("Fiona", 21);
        ageMap.put("George", 34);
        ageMap.put("Hannah", 29);

        ageMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey() +" : "+entry.getValue()) );

        }
}


