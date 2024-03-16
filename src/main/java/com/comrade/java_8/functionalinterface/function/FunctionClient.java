package com.comrade.java_8.functionalinterface.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionClient {
    public static void main(String[] args) {
        FunctionClient functionClient = new FunctionClient();
        simpleFunctionExample();
        functionChainingExample();
        List<String> names = Arrays.asList("Shiva", "Satish", "Ravi");
        convertListToMap(names, name -> name.length());
        convertListToMap(names, functionClient::getNameLength);
    }

    private static void functionChainingExample() {
        Function<String, Integer> lengthFunction = name -> name.length();
        Function<Integer, Integer> doubleNameLength = namelength -> namelength * 2;
        Integer output = lengthFunction.andThen(doubleNameLength).apply("Shiva");
        System.out.println(output);

    }

    private static void simpleFunctionExample() {
        Function<String, Integer> lengthFunction = name -> name.length();
        Integer lengthOfName = lengthFunction.apply("Shiva");
        System.out.println(lengthOfName);
    }

    private static <T, R> Map<T, R> convertListToMap(List<T> names, Function<T, R> functionDef) {
        HashMap<T, R> namesMap = new HashMap<>();
        for (T name : names) {
            namesMap.put(name, functionDef.apply(name));
        }
        return namesMap;
    }

    public Integer getNameLength(String name) {
        return name.length();
    }
}
