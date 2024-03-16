package com.comrade.interview.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeClient {

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("B",1000),new Employee("A",500000),
                        new Employee("C",10000),new Employee("D",90000));
        Predicate<Employee> salaryPredicate = employee -> employee.getSal() > 10000;
        Predicate<Employee> namePredicate = employee -> employee.getName().startsWith("B");

        var emps= employees.stream().filter(salaryPredicate.or(namePredicate)).map(Employee::getName).collect(Collectors.toList());
        System.out.println(emps);
    }
}
