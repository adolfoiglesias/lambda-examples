package com.amich.lambda.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  - Get the average value for given a numbers list
 */
public class AverageValue {

    public static void main(String[] args) {
        var list = List.of(23,5,30,6,3);

        var result1 = list.stream().mapToInt(num -> num).average().orElse(0d);
        System.out.println(result1);

        var result2 = list.stream().mapToInt(num -> num)
                .summaryStatistics().getAverage();

        System.out.println(result2);

    }
}
