package com.javangon;

import java.util.Iterator;
import java.util.List;

public class CombinationIterator<T> implements Iterator<Combination<? extends T>>
{
    private final List<? extends T> list;
    private final CombinationIndexer indexer;

    private CombinationIterator(List<? extends T> list)
    {
        this.list = list;
        indexer = new CombinationIndexer(list.size());
    }

    public static <T> CombinationIterator<T> of(List<? extends T> list)
    {
        return new CombinationIterator<>(list);
    }

    public boolean hasNext()
    {
        return indexer.hasMoreCombinations();
    }

    @Override
    public Combination<T> next()
    {
        T primaryObject = list.get(indexer.getPrimaryIndex());
        T secondaryObject = list.get(indexer.getSecondaryIndex());

        Combination<T> combination = Combination.of(primaryObject, secondaryObject);

        indexer.advanceToNexCombination();

        return combination;
    }
}
