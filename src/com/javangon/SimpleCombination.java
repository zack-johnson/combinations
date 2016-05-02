package com.javangon;

public class SimpleCombination<T> implements Combination<T>
{
    private final T first;
    private final T second;

    private SimpleCombination(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public static <T> SimpleCombination<T> of(T first, T second)
    {
        return new SimpleCombination<>(first, second);
    }

    @Override
    public T getFirst()
    {
        return first;
    }

    @Override
    public T getSecond()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return String.format("first:%s second %s", first.toString(), second.toString());
    }
}
