package org.example.stream;

//Count employees in each department.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployee {
    public static void main(String[] args) {
        List<EmployeeData> emp = Arrays.asList(new EmployeeData("Joe",1000,"IT"),
                new EmployeeData("Sam",2000,"Finance"),
                new EmployeeData("Jhon",1000,"IT"),
                new EmployeeData("Lowes",3000,"Business"),
                new EmployeeData("Tim",1000,"Finance")
        );
        Map<String, Long> output = emp.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.counting()));
        System.out.println(output);
    }
}
