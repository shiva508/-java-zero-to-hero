package com.comrade.java_8.streams.allmatch;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAllMatchClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        String lastNameInput = "Dasari";
        String firstNameInput = "Shiva";
        allMatchPositive(students, lastNameInput);
        allMatchNegative(students, firstNameInput);
        Function<Student,String> stringFunction=student->student.getFirstName();
        Predicate<Student> studentPredicate=student -> student.getAge()>20;
        var sts = students.stream().filter(studentPredicate).map(Student::getFirstName).collect(Collectors.joining(","));
        var stqw = students.stream().filter(studentPredicate).map(Student::getFirstName).collect(Collectors.joining(",")).length();
        System.out.println(sts);
        System.out.println(stqw);
    }

    private static void allMatchPositive(List<Student> students, String lastNameInput) {
        Predicate<String> nameContains = lastName -> lastName.contains(lastNameInput);
        boolean allLastNameMatched = students.stream().allMatch(student -> nameContains.test(student.getLastName()));
        System.out.println("All MATCH:" + allLastNameMatched);
    }

    private static void allMatchNegative(List<Student> students, String lastNameInput) {
        Predicate<String> nameContains = lastName -> lastName.contains(lastNameInput);
        boolean allLastNameMatched = students.stream().allMatch(student -> nameContains.test(student.getLastName()));
        System.out.println("All MATCH:" + allLastNameMatched);
    }
}
