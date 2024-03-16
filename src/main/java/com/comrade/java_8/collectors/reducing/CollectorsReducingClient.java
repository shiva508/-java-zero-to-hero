package com.comrade.java_8.collectors.reducing;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectorsReducingClient{
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var optionalStudent = students.stream().collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Student::getEduLevel))));
        System.out.println(optionalStudent);
        var subsraction = students.stream().map(Student::getAge).collect(Collectors.reducing(1, (ageOne, ageTwo) -> ageOne - ageTwo));
        System.out.println(subsraction);
        var addition = students.stream().map(Student::getAge).collect(Collectors.reducing(1, (ageOne, ageTwo) -> ageOne + ageTwo));
        System.out.println(addition);
    }
}
