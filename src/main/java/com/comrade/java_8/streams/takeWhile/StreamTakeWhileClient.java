package com.comrade.java_8.streams.takeWhile;


import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTakeWhileClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Collection<Integer> c = Set.of(1,2,3,4,5,6,7);
//        var r = c.stream()
//                .takeWhile(e -> e < 7).collect(Collectors.toList());
        var stu =  students.stream().takeWhile(student -> student.getGender().equals("M")).map(Student::getFirstName).collect(Collectors.toList());
        System.out.println(stu);

    }
}
