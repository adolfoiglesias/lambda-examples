package com.calarix.lambda.example.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  1. given a array, find nth odd element ( obtener el enesimo elemento impar de la lista )
 *
 *  1. given a array, find nth-index odd element ( obtener el enesima posicion  impar de la lista )
 */
public class NthOddElement {

    public static void main(String[] args) {
        int nthElement = 2;

        System.out.println("--- 1st excercise ---");

        Integer[] array1 = new Integer[]{3,10,5,10,3,7,8};
        findNthOddElement(array1, nthElement);

        Integer[] array2 = new Integer[]{3,10,5,8};
        findNthOddElement(array2, nthElement);

        Integer[] array3 = new Integer[]{3,10,8};
        findNthOddElement(array3, nthElement);

        // 2nd excercise ----
        System.out.println("--- 2nd excercise ---");
        int pos = 3;
        findNthIndexOddElement(array1, pos);

        pos = 4;
        findNthIndexOddElement(array1, pos);

        pos = 4;
        array1 = new Integer[]{3,10,5,10,3,7,8, 15};
        findNthIndexOddElement(array1, pos);

    }

    static void findNthOddElement(Integer[] array, int nthElement) {

        var result = Stream.of(array)
                .filter(n -> n%2 != 0)
                .toList();

        if (result.size() >= nthElement){
            System.out.println(result.get(nthElement-1));
        } else {
            System.out.println(0);
        }
    }

    static void findNthIndexOddElement(Integer[] array, int nthElement) {

        int index = nthElement * 2 - 1;

        if (array.length > index) {
            System.out.println(array[index]);
        } else {
            System.out.println(0);
        }

    }
}
