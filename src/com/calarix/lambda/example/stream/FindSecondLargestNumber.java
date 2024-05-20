package com.calarix.lambda.example.stream;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  - Given a number list , find 2nd largest number and print it
 */

public class FindSecondLargestNumber {

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[]{2,5,3,10,12, 12};

        var second = Stream.of(arr1).sorted().distinct().toList().get(arr1.length-2);

        System.out.println(second);

    }
}
