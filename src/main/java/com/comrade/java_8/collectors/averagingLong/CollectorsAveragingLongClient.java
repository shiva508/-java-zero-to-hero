package com.comrade.java_8.collectors.averagingLong;



import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingLongClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var averagingLong = students.stream().collect(Collectors.averagingLong(Student::getAge));
        System.out.println(averagingLong);
    }
}
