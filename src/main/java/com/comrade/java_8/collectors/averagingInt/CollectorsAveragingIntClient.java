package com.comrade.java_8.collectors.averagingInt;


import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingIntClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var averagingInt = students.stream().collect(Collectors.averagingInt(Student::getAge));
        System.out.println(averagingInt);
    }
}
