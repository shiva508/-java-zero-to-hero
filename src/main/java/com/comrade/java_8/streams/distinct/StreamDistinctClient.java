package com.comrade.java_8.streams.distinct;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinctClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        List<String> names = students.stream().map(Student::getGender).distinct().collect(Collectors.toList());
        System.out.println(names);

        String [] nameOne={"Shiva","Satish"};
        String [] nameTwo={"Gopi","Ravi"};
        String [] nameThree={"Shiva"};
        var stringSet = Stream.of(nameOne, nameTwo, nameThree).flatMap(Arrays::stream).collect(Collectors.toSet());
        System.out.println(stringSet);
    }
}
