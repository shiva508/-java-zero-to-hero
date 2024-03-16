package com.comrade.java_8.streams.sorted;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.*;
import java.util.stream.IntStream;

public class ComparatorClient {
    public static void main(String[] args) {
        basicComparisio();

        //buggOnComarinRange();
        //comparingOrder();
        var points = IntStream.range(0, 10).mapToObj(Point::new)
                .toList();
        Set<Point> pointSet=new HashSet<>();
        pointSet.addAll(points);
        var point = points.get(5);
        System.out.println(pointSet.contains(point));
        //do not do it
        point.x=40;
        System.out.println(pointSet.contains(point));
    }

    private static void comparingOrder() {
        List<Student> students = StreamUtil.studentsBuilder();
        var studentList = students.stream().sorted(Comparator.comparing(Student::getFirstName)
                        .thenComparing(Student::getLastName)
                        .thenComparingInt(Student::getAge))
                .toList();
        System.out.println(studentList);
        var studentListReversed = students.stream().sorted(Comparator.comparing(Student::getFirstName)
                        .thenComparing(Student::getLastName)
                        .thenComparingInt(Student::getAge).reversed())
                .toList();
        System.out.println(studentListReversed);
    }

    private static void buggOnComarinRange() {
        Random random=new Random(209);
        var collect = IntStream.range(0, 32).mapToObj(value -> random.nextInt())
                .toList();
        var integers = collect.stream().sorted((in1, in2) -> in1 - in2).toList();
    }

    private static void basicComparisio() {
        var strings= Arrays.asList("one","two","three","four","five");
        var sortedOne = strings.stream().sorted().toList();
        //When pass
        System.out.println(sortedOne);
    }
}
