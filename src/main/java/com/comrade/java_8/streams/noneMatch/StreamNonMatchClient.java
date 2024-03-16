package com.comrade.java_8.streams.noneMatch;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.function.Predicate;

public class StreamNonMatchClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        String lastNameInput = "Bandari";
        String firstNameInput = "Nithya";
        nonMatchPositive(students, lastNameInput);
        nonMatchnagative(students, firstNameInput);
    }

    private static void nonMatchnagative(List<Student> students, String firstNameInput) {
        Predicate<Student> firstNamePredicate = student -> student.getFirstName().contains(firstNameInput);
        boolean nonMantch = students.stream().noneMatch(student -> firstNamePredicate.test(student));
        System.out.println(nonMantch);
    }

    private static void nonMatchPositive(List<Student> students, String lastNameInput) {
        Predicate<Student> firstNamePredicate = student -> student.getFirstName().contains(lastNameInput);
        boolean nonMantch = students.stream().noneMatch(student -> firstNamePredicate.test(student));
        System.out.println(nonMantch);
    }
}
