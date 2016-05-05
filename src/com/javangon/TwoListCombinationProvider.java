package com.javangon;

import java.util.List;

public class TwoListCombinationProvider<T> implements CombinationProvider<T>
{
    private final List<? extends T> primaryList;
    private final List<? extends T> secondaryList;
    private TwoListCombinationIndexer indexer;

    public TwoListCombinationProvider(List<? extends T> primaryList,
            List<? extends T> secondaryList)
    {
        this.primaryList = primaryList;
        this.secondaryList = secondaryList;
        indexer = new TwoListCombinationIndexer(primaryList.size(), secondaryList.size());
    }

    @Override
    public boolean hasMoreCombinations()
    {
        return indexer.hasMoreCombinations();
    }

    @Override
    public Combination<T> getNext()
    {
        T primary = primaryList.get(indexer.getPrimaryIndex());
        T secondary = secondaryList.get(indexer.getSecondaryIndex());
        Combination<T> combination = Combination.of(primary, secondary);
        indexer.advanceToNexCombination();
        return combination;
    }
}
