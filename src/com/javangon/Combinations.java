package com.javangon;

import java.util.Iterator;
import java.util.List;

public class Combinations<T> implements Iterator<Combination<? extends T>>
{
    private final CombinationProvider<T> combinationProvider;

    private Combinations(List<? extends T> list)
    {
        combinationProvider = new SingleListElementCombiner<>(list);
    }

    private Combinations(List<? extends T> list1, List<? extends T> list2)
    {
        combinationProvider = new TwoListCombinationProvider<>(list1, list2);
    }

    public static <T> Combinations<T> of(List<? extends T> list)
    {
        return new Combinations<>(list);
    }

    public static <T> Combinations<T> of(List<? extends T> list, List<? extends T> list2)
    {
        return new Combinations<>(list, list2);
    }

    public boolean hasNext()
    {
        return combinationProvider.hasMoreCombinations();
    }

    @Override
    public Combination<T> next()
    {
        return combinationProvider.getNext();
    }
}
