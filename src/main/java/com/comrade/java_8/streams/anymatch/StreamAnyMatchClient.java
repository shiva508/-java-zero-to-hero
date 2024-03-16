package com.comrade.java_8.streams.anymatch;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.function.Predicate;

public class StreamAnyMatchClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        String lastNameInput = "Dasari";
        String firstNameInput = "Shiva";
        anyMatchPositive(students, lastNameInput);
        anyMatchnagative(students, firstNameInput);
    }

    private static void anyMatchnagative(List<Student> students, String firstNameInput) {
        Predicate<Student> firstNamePredicate = student -> student.getFirstName().contains(firstNameInput);
        boolean anyMantch = students.stream().anyMatch(student -> firstNamePredicate.test(student));
        System.out.println(anyMantch);
    }

    private static void anyMatchPositive(List<Student> students, String lastNameInput) {
        Predicate<Student> firstNamePredicate = student -> student.getFirstName().contains(lastNameInput);
        boolean anyMantch = students.stream().anyMatch(student -> firstNamePredicate.test(student));
        System.out.println(anyMantch);
    }
}
