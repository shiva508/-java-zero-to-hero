package com.comrade.java_8.streams.reduce;

import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Arrays;
import java.util.List;

public class StreamReduceClient {
    public static void main(String[] args) {
        basicReduce();
        advancedReduce();
    }

    private static void advancedReduce() {
        List<Student> students = StreamUtil.studentsBuilder();
        var reduce = students.stream().mapToInt(Student::getAge).reduce(0, Integer::sum);
        System.out.println(reduce);
    }

    private static void basicReduce() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var reduceSum = Arrays.stream(numbers).reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(reduceSum);
        var reduceSumRef = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(reduceSumRef);
    }
}
