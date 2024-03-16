package com.comrade.java_8.collectors.summingInt;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;
public class CollectorsSummingIntClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var summingInt = students.stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println(summingInt);
    }
}
