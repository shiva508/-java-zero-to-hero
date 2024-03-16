package com.comrade.java_8.streams.filter;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Predicate<Student> genderFilter = student -> student.getGender().equals("F");
        List<Student> filteredStudents = students.stream().filter(genderFilter).collect(Collectors.toList());
        System.out.println(filteredStudents);
        filterNullValues();
    }

    private static void filterNullValues() {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        List<String> result = language.filter(Objects::nonNull).toList();
        result.forEach(System.out::println);
    }
}
