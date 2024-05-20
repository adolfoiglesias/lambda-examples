package com.amich.lambda.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionByAndGroupBy {

    public static void main(String[] args) {


        // partioning by: Solo usado para agrupar un stream en dos partes
        // Ej: par e impar

        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(isEven.get(true));
        System.out.println(isEven.get(false));

        // grouping example
        System.out.println(" *** Grouping example ***");
        groupingByExample();

    }

    static void groupingByExample() {
        String[] names = new String[] {"Adolfo", "Miguel", "Analina", "Daniela"};

        Map<Character, List<String>>  res = Stream.of(names)
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("key A" + res.get('A'));
        System.out.println("key M" + res.get('M'));
        System.out.println("key D" + res.get('D'));
    }
}
