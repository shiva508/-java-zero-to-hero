package com.comrade.java_8.collectors.maxBy;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMaxByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var maxAge = students.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(maxAge);
    }
}
