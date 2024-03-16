package com.comrade.java_8.streams.flatMap;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;
import com.comrade.utils.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapClient {
    public static void main(String[] args) {
        flattening();
        flatteningAndMapping();
    }

    private static void flatteningAndMapping() {
        List<Student> students = StreamUtil.studentsBuilder();
        Set<Role> collect = students.stream().flatMap(sts -> sts.getRoles().stream()).collect(Collectors.toSet());
        System.out.println(collect);
        flatteningNumberAndSumming();

    }

    private static void flatteningNumberAndSumming() {
        int [] inputOne={1,2,3,4,5};
        int [] inputTwo={6,7,8,9,10};
        var flatteningIntArray = Stream.of(inputOne,inputTwo).flatMap(ints -> Arrays.stream(ints).boxed()).collect(Collectors.toSet());
        var flatteningIntArraySum = (Integer) Stream.of(inputOne, inputTwo).flatMap(ints -> Arrays.stream(ints).boxed()).mapToInt(Integer::intValue).sum();
        System.out.println(flatteningIntArray);
        System.out.println(flatteningIntArraySum);
    }

    private static void flattening() {
        List<String> batchOne= Arrays.asList("Shiva","Satish","Ravi");
        List<String> batchTwo= Arrays.asList("Batman","Superman","Ironman");
        List<List<String>> treeBranch=Arrays.asList(batchOne,batchTwo);
        List<String> stringList = treeBranch.stream().flatMap(Collection::stream).toList();
        stringList.forEach(System.out::println);
    }
}
