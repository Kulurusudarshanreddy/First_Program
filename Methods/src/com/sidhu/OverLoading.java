package com.sidhu;

public class OverLoading {
    //overloading means we can have multiple methods of same name but with different number of arguments.
    public static void main(String[] args)
    {
        fly(32);
        fly("reddy");
    }

    static void fly(int a)
    {
        System.out.println(a);
    }

    static void fly(String name)
    {
        System.out.println(name);
    }
}
