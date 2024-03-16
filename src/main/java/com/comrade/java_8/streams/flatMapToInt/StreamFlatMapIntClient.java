package com.comrade.java_8.streams.flatMapToInt;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamFlatMapIntClient {
    public static void main(String[] args) {
        flatteningAndMapping();
        flattening();
    }

    private static void flattening() {
        List<List<String>> treeNums= Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("5", "6"),
                Arrays.asList("3", "4")
        );

        IntStream intStream=treeNums.stream().flatMapToInt(strings -> strings.stream().mapToInt(Integer::parseInt));
        var sum = intStream.peek(System.out::println).sum();
        System.out.println(sum);
    }

    private static void flatteningAndMapping() {
        List<Student> students = StreamUtil.studentsBuilder();
        var intStream = students.stream().flatMapToInt(student -> IntStream.of(student.getAge()));
        intStream.forEach(System.out::println);
    }
}

