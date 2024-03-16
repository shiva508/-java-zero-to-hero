package com.comrade.java_14.records;


import com.comrade.utils.StreamUtil;

public class CollegeUtil {
    public static void main(String[] args) {
        var college = new College(StreamUtil.studentsBuilder());
        college.studentList().stream().peek(student -> student.setFirstName(student+"========="));
        college.studentList().forEach(System.out::println);
    }
}
