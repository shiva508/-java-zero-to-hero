package com.comrade.interview.callablerunable;



import com.comrade.interview.filter.Employee;

import java.util.Arrays;
import java.util.List;

public class StreamApiMethodsClient {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("Satish",1500),
                                                new Employee("Shiva",500),
                                                new Employee("Dasari Shiva",1000),
                                                new Employee("Ravi",2500),
                                                new Employee("Batman",600));

        //employees.stream().sorted();
        //employees.stream().collect()
        //employees.stream().limit()
        //employees.stream().findFirst()
        //employees.stream().map()
        //employees.stream().skip()
        //employees.stream().flatMap()
        //employees.stream().allMatch()
        //employees.stream().count()
        //employees.stream().dropWhile()
        //employees.stream().forEach();
        //employees.stream().unordered()
        //employees.stream().findAny()
        //employees.stream().toList()
        //employees.stream().max()
        //employees.stream().min()
        //employees.stream().reduce()
        //employees.stream().takeWhile()
        //employees.stream().peek()
        //employees.stream().noneMatch()
        //employees.stream().spliterator()
        //employees.stream().sequential()
        //employees.stream().forEachOrdered();
    }
}
