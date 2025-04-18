package org.example.stream;

//Sort a list of employees by salary.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saloni",993);
        Employee emp2 = new Employee("Joe",893);
        Employee emp3 = new Employee("Stive",123);
        List<Employee> input = Arrays.asList(emp1,emp2,emp3);
        List<Employee> output = input.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(output);
    }
}
class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name+" : "+salary;
    }
}
