package com.comrade.java_8.collectors.minBy;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;

public class CollectorsMinByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var collect = students.stream().map(Student::getFirstName).min(String::compareTo);
        System.out.println(collect);
    }
}
