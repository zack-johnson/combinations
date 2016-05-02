package com.javangon;

public class Combination<T>
{
    private final T first;
    private final T second;

    private Combination(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public static <T> Combination<T> of(T first, T second)
    {
        return new Combination<>(first, second);
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %s", first, second);
    }
}
