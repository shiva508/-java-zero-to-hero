package com.comrade.java_8.collectors.partitioningBy;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;
public class CollectorsPartitioningByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var partitioningBy = students.stream().collect(Collectors.partitioningBy(student -> student.getGender().equals("F")));
        System.out.println(partitioningBy);
    }
}
