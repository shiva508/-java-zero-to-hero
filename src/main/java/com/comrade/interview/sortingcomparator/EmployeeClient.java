package com.comrade.interview.sortingcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("Satish",1500),
                                                new Employee("Shiva",500),
                                                new Employee("Dasari Shiva",1000),
                                                new Employee("Ravi",2500),
                                                new Employee("Batman",600));
        var emp = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).limit(1).findFirst().get();
        System.out.println(emp);
        var sortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getName)).limit(1).findFirst().get();
        System.out.println(sortedEmp);
    }
}
