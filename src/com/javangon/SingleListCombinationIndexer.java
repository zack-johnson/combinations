package com.javangon;

public class SingleListCombinationIndexer
{
    private int primaryIndex;
    private int secondaryIndex;
    private int lastPrimaryIndex;
    private int lastSecondaryIndex;

    public SingleListCombinationIndexer(int listSize)
    {
        primaryIndex = 0;
        secondaryIndex = 1;
        lastPrimaryIndex = listSize - 2;
        lastSecondaryIndex = listSize - 1;
    }

    public boolean hasMoreCombinations()
    {
        return primaryIndex <= lastPrimaryIndex;
    }

    public int getPrimaryIndex()
    {
        return primaryIndex;
    }

    public int getSecondaryIndex()
    {
        return secondaryIndex;
    }

    public void advanceToNexCombination()
    {
        if (secondaryIndex == lastSecondaryIndex)
        {
            primaryIndex++;
            secondaryIndex = primaryIndex + 1;
        }
        else{
            secondaryIndex++;
        }
    }
}