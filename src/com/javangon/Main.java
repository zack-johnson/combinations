package com.javangon;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(0,1,2,3);

        CombinationIterator<Integer> integerCombinations = new CombinationIterator<>(list);

        integerCombinations.forEachRemaining(System.out::println);
    }
}
