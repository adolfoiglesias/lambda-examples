package com.calarix.lambda.example.stream;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
        1. given a number, true = it is prime number, false it is not a prime number

        2. given a number list , get the 3rd prime number

        3. given a number list , true if all  numbers are prime

        4. get the nth prime number given a value of n . Ej: n = 20, get 20th prime number starting from 1
 */
public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("case 0: " + isPrimeNumber(57));
        System.out.println("case 1: " + isPrimeNumber(5));
        System.out.println("case 2: " + isPrimeNumber(17));
        System.out.println("case 3: " + isPrimeNumber(25));
        System.out.println("case 4: " + isPrimeNumber(2542));
        System.out.println("case 5: " + isPrimeNumber(254249283));

        // 2nd excercise
        System.out.println(" 2nd Excercise - Getting  nthElement prime of the list");
        int[] array = new int[]{ 3, 10, 34, 58, 23, 57 };
        System.out.println(getNthPrimeElement(array, 3));
        System.out.println(getNthPrimeElement(array, 2));
        System.out.println(getNthPrimeElement(array, 1));

        // 4th excersice
        System.out.println("*** 4th excersice ***");
        System.out.println(getNthPrimeUsingWhile(20));
        System.out.println(getNthPrimeUsingStream(20));

    }

    static int getNthPrimeUsingWhile(int nthPrimeNumber) {
        int totalPrime = 0;
        int n = 1;
        int num = 0;
        while(totalPrime < nthPrimeNumber) {
            if (isPrimeNumber(n)) {
                totalPrime++;
                num = n;
            }
            n++;
        }
        return num;
    }
  static int getNthPrimeUsingStream(int nthPrimeNumber) {
        return Stream.iterate(1,n -> n+1)
                .filter(PrimeNumber::isPrimeNumber)
                .limit(nthPrimeNumber)
                .mapToInt(n-> n)
                .summaryStatistics().getMax();



    }

    static int getNthPrimeElement(int[] array, int nthElement) {

        int i = 0;
        int pos = 0;
        while(i < array.length && nthElement != 0) {

            if (isPrimeNumber(array[i])){
                nthElement--;
                pos = i;
            }
            i++;
        }
        if (nthElement == 0) {
            return array[pos];
        } else {
            return -1;
        }
    }

    static boolean isPrimeNumber(int number) {
        // example = 5
        //  2, 3, 4,
        // for 4
        //  2, 3,
        return IntStream.range(2, number).boxed().allMatch(n ->  {
            return number%n != 0;
        });
    }


}
