package com.javangon;

public interface CombinationProvider<T>
{
    boolean hasMoreCombinations();
    Combination<T> getNext();
}
