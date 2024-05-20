package com.amich.lambda.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        int number = 20;
        List<int[]> list = Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0]+ t[1]})
                .limit(number+1)
                .toList();

        list.forEach(el -> Stream.of(el).forEach(System.out::println));

    }
}
