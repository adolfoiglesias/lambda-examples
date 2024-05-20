package com.amich.lambda.example.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *  - given a numbers array, find max value
 */

public class FindMax {

    public static void main(String[] args) {

        Integer[] arrays = new Integer[] {2,5,10,5,3};

        // Approach 1
        var max1 =Collections.max(List.of(arrays));
        System.out.println(max1);

        // Approach 2
        var max2 = Stream.of(arrays).mapToInt(n -> n).summaryStatistics().getMax();
        System.out.println(max2);

        var max3 = Stream.of(arrays).max(Integer::compareTo).orElseThrow();
        System.out.println(max3);
    }
}
