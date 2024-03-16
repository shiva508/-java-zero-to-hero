package com.comrade.java_8.collectors.toCollection;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToCollectionClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var stringTreeSet = students.stream().map(Student::getFirstName).collect(Collectors.toCollection(TreeSet::new));
        stringTreeSet.forEach(System.out::println);
        var collect = Stream.iterate(BigDecimal.ZERO, bigDecimal -> bigDecimal.add(BigDecimal.ONE))
                .limit(8)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect);
    }
}
