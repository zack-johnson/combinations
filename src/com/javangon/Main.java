package com.javangon;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3);
        List<String> strings = Arrays.asList("matt", "bill", "mark");
        List<String> strings2 = Arrays.asList("jeff", "liam");

        Combinations.of(ints).forEachRemaining(System.out::println);
        Combinations.of(strings, strings2).forEachRemaining(System.out::println);

//        0, 1
//        0, 2
//        0, 3
//        1, 2
//        1, 3
//        2, 3
//        matt, jeff
//        matt, liam
//        bill, jeff
//        bill, liam
//        mark, jeff
//        mark, liam
    }
}
