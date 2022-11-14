package com.sidhu;

import java.util.Arrays;

public class OverRiding {
    // overriding means we can have the same methods name but changing arguments types.
    public static void main(String[] args)
    {
//        demo(); // if you didn't give any value, the compiler will get confused with method to call that is called ambiguity.
          demo(34,6,7,8);
          demo("demo", "fly");
    }

    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
