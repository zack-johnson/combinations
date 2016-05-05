package com.javangon;

public class TwoListCombinationIndexer
{
    private int primaryIndex;
    private int secondaryIndex;
    private int lastPrimaryIndex;
    private int lastSecondaryIndex;

    public TwoListCombinationIndexer(int list1Size, int list2Size)
    {
        primaryIndex = 0;
        secondaryIndex = 0;
        lastPrimaryIndex = list1Size - 1;
        lastSecondaryIndex = list2Size - 1;
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
            secondaryIndex = 0;
        }
        else{
            secondaryIndex++;
        }
    }
}
