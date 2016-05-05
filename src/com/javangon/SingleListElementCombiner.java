package com.javangon;

import java.util.List;

public class SingleListElementCombiner<T> implements CombinationProvider<T>
{
    private final List<? extends T> list;
    private final SingleListCombinationIndexer indexer;

    public SingleListElementCombiner(List<? extends T> list)
    {
        this.list = list;
        indexer = new SingleListCombinationIndexer(list.size());
    }


    @Override
    public boolean hasMoreCombinations()
    {
        return indexer.hasMoreCombinations();
    }

    @Override
    public Combination<T> getNext()
    {
        T primary = list.get(indexer.getPrimaryIndex());
        T secondary = list.get(indexer.getSecondaryIndex());
        Combination<T> combination = Combination.of(primary, secondary);
        indexer.advanceToNexCombination();
        return combination;
    }
}
