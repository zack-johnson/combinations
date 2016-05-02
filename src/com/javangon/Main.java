package com.javangon;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> ints = Arrays.asList(0,1,2,3);
        List<String> strings = Arrays.asList("matt", "bill", "mark", "dave");

        CombinationIterator.of(ints).forEachRemaining(System.out::println);
        CombinationIterator.of(strings).forEachRemaining(System.out::println);
    }
}
