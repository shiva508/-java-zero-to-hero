package com.comrade.java_8.streams.max;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxClient {
    public static void main(String[] args) {
        String[] inputData = {"aaaa", "aaa", "a", "aaaaa"};
        var max = Arrays.stream(inputData).max(Comparator.comparingInt(String::length)).orElseGet(String::new);
        System.out.println(max);
        List<Student> students = StreamUtil.studentsBuilder();
        var get = students.stream().map(Student::getFirstName).toList().stream().max(Comparator.comparing(String::length)).orElseGet(String::new);
        System.out.println(get);
    }
}
