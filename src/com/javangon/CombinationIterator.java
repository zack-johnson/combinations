package com.javangon;

import java.util.Iterator;
import java.util.List;

public class CombinationIterator<T> implements Iterator<Combination<? extends T>>
{
    private final List<? extends T> list;
    private final CombinationIndexer indexer;

    public CombinationIterator(List<? extends T> list)
    {
        this.list = list;
        indexer = new CombinationIndexer(list.size());
    }

    @Override
    public boolean hasNext()
    {
        return indexer.hasMoreCombinations();
    }

    @Override
    public Combination<T> next()
    {
        T primaryObject = list.get(indexer.getPrimaryIndex());
        T secondaryObject = list.get(indexer.getSecondaryIndex());

        Combination<T> combination = SimpleCombination.of(primaryObject, secondaryObject);

        indexer.advanceToNexCombination();

        return combination;
    }
}
