package com.comrade.java_8.collectors.summingDouble;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummingDoubleClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var summingDouble = students.stream().collect(Collectors.summingDouble(Student::getAge));
        System.out.println(summingDouble);
    }
}
