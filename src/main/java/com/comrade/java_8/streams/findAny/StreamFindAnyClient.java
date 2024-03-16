package com.comrade.java_8.streams.findAny;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.Optional;

public class StreamFindAnyClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Optional<Student> findAny= students.stream().filter(student -> student.getGender().equals("F")).findAny();
        findAny.ifPresentOrElse(System.out::println,()->new RuntimeException("Noting found"));

    }
}
