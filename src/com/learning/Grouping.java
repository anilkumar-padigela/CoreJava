package com.learning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {
        String s= "dgsdfgdfsgdfsgdfsg";
        Map<String , List<String>> grouping = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity()));
        System.out.println("Grouping:::"+grouping);
    }
}
