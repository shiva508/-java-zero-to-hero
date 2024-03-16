package com.comrade.java_8.streams.map;


import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MapClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var names = students.stream().map(Student::getFirstName).sorted(String::compareTo).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
