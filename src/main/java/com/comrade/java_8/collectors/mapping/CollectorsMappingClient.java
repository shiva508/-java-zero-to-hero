package com.comrade.java_8.collectors.mapping;


import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMappingClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var mapData = students.stream().collect(Collectors.groupingBy(Student::getLastName, Collectors.mapping(Student::getFirstName, Collectors.toSet())));
        System.out.println(mapData);
        var stringSetMap = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName,
                        Collectors.flatMapping(student -> student.getRoles()
                                .stream().map(Role::getRoleName).collect(Collectors.toSet())
                                .stream(), Collectors.toSet())));
        System.out.println(stringSetMap);
    }
}
