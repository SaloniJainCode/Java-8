package org.example.stream;

//Find the employee with the highest salary.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindEmployee {
    public static void main(String[] args) {
        List<EmployeeDetail> input = Arrays.asList(new EmployeeDetail(80,"Joe"),
                                                    new EmployeeDetail(90,"Patrick"),
                                                    new EmployeeDetail(679,"lowes")
        );
        Optional<EmployeeDetail> output = input.stream().
                                        max(Comparator.comparing(EmployeeDetail::getSalary)
        );
        System.out.println(output.get());

    }
}
class EmployeeDetail{
    int salary;
    String name;

    public EmployeeDetail(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +" : "+salary;
    }
}
