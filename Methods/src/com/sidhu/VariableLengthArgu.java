package com.sidhu;

import java.util.Arrays;

public class VariableLengthArgu {
    // we used variablelengtharguments when we don't know how many arguments to take this concept comes in picture.
    public static void main(String[] args) {
        fun(2,44,4,3,2,7,5,7);  // It will store internally in string format.
        multiple(5,15,"sidhu");

    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));

    }

    static void multiple(int a, int b, String ...v) // note the order wise we should give the values.
    {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
