package com.comrade.java_8.collectors.toList;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var integerList = students.stream().mapToInt(Student::getAge).boxed().collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }
}
