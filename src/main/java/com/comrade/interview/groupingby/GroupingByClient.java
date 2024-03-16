package com.comrade.interview.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByClient {
    public static void main(String[] args) {
        List<Student> users= Arrays.asList(new Student("Shiva",1,"3"),
                                           new Student("Geetha",3,"4"),
                                           new Student("Madhu",3,"3"));
        Map<String, Long> collect = users.stream().collect(Collectors.groupingBy(Student::getStndard, Collectors.counting()));
        System.out.println(collect);
    }
}
