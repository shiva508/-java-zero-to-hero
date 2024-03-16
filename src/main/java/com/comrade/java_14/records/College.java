package com.comrade.java_14.records;

import com.comrade.utils.Student;

import java.util.List;

public record College(List<Student> studentList) {
    public College(List<Student> studentList){
        this.studentList=List.copyOf(studentList);
    }
}
