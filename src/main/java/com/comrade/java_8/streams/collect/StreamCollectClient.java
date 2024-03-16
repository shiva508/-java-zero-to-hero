package com.comrade.java_8.streams.collect;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        simpleCollectOperation(students);
        simpleCollectOperationByMap(students);
        simpleCollectOperation3Param(students);
        simpleCollectOperation3ParamString(students);
    }

    private static void simpleCollectOperation(List<Student> students) {
        Map<String, List<Student>> groupByGender = students.stream().collect(Collectors.groupingBy(Student::getGender));
        groupByGender.forEach((key, value) -> System.out.println(key + ":" + value.size()));
    }

    private static void simpleCollectOperationByMap(List<Student> students) {
        Map<String, Map<Integer, List<Student>>> groupByGender = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.groupingBy(Student::getEduLevel)));
        groupByGender.forEach((key, value) -> {
            System.out.println(key + ":" + value.size());
            value.forEach((valuekey, valuevalue) -> {
                System.out.println(valuekey + ":" + valuevalue.size());
            });
        });
    }

    private static void simpleCollectOperation3Param(List<Student> students) {
        List<String> name = students.stream().map(Student::getFirstName).collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);
        System.out.println(name);
    }

    private static void simpleCollectOperation3ParamString(List<Student> students) {
        String name = students.stream().map(Student::getFirstName).collect(StringBuilder::new, StringBuilder::append,
                StringBuilder::append).toString();
        System.out.println(name);
        String concatinated = students.stream().map(Student::getFirstName)
                .collect(StringBuilder::new, (x, y) -> x.append(y),
                        (a, b) -> a.append(",").append(b))
                .toString();
        System.out.println(concatinated);

        String concatinated1 = students.stream().map(Student::getFirstName).collect(Collectors.joining(","));
        System.out.println(concatinated1);
    }

}
