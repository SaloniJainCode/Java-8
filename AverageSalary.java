package org.example.stream;

//Given a list of persons, find the average salary of people older than 30.

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSalary {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(new People("Saloni",29,2000),
                                            new People("Joe",31,3000),
                                            new People("Lowes",40,5000)
        );
        OptionalDouble output = people.stream().filter(x->x.getAge()>30).mapToInt(People::getSalary).average();
        System.out.println(output);
    }
}
class People{
    String name;
    int age;
    int salary;

    public People(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: "+name+
                " Age: "+age+
                " Salary: "+salary;
    }
}
