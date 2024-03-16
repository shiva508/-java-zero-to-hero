package com.comrade.java_8.collectors.collectingAndThen;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsCollectingAndThenClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var integerSetMap = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet)));
        System.out.println(integerSetMap);

        Map<String, Set<Integer>> result = students.stream().collect(Collectors.groupingBy(Student::getFirstName,
                Collectors.mapping(Student::getAge,
                        Collectors.collectingAndThen(Collectors.toSet(),
                                Collections::unmodifiableSet))));
        System.out.println(result);
    }
}
