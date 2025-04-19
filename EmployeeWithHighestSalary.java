package org.example.stream;

//From a list of employees, return the name of the employee with the highest salary.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeWithHighestSalary {
    public static void main(String[] args) {
        List<EmployeeData> emp = Arrays.asList(new EmployeeData("Joe",1000,"IT"),
                new EmployeeData("Sam",2000,"Finance"),
                new EmployeeData("Jhon",1000,"IT"),
                new EmployeeData("Lowes",3000,"Business"),
                new EmployeeData("Tim",1000,"Finance")
        );
        Optional<EmployeeData> output = emp.stream().max(Comparator.comparing(EmployeeData::getSalary));
        System.out.println(output.get());
    }
}
