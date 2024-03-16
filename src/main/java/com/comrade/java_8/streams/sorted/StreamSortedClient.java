package com.comrade.java_8.streams.sorted;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedClient {
    public static void main(String[] args) {
        List<Role> roles = StreamUtil.rolesBuilder();
        var collect = roles.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect);

        List<Student> students=StreamUtil.studentsBuilder();
        var collect1 = students.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect1);
    }
}
