package org.example.stream;

// Group employees by department.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployee {
    public static void main(String[] args) {
        List<EmployeeData> emp = Arrays.asList(new EmployeeData("Joe",1000,"IT"),
                                                new EmployeeData("Sam",2000,"Finance"),
                                                new EmployeeData("Jhon",1000,"IT"),
                                                new EmployeeData("Lowes",3000,"Business"),
                                                new EmployeeData("Tim",1000,"Finance")
        );
        Map<String,List<EmployeeData>> output = emp.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment));
        System.out.println(output);
    }
}
class EmployeeData{
    String name;
    int salary;
    String department;

    public EmployeeData(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return " Name: " +name+
                " Salary: "+salary+
                " Department: "+department;
    }
}
