package com.comrade.java_8.streams.count;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;

public class StreamCountClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        int total = students.stream().mapToInt(Student::getEduLevel).sum();
        System.out.println(total);
    }
}
