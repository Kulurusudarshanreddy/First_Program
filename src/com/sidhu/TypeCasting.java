package com.sidhu;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //Type casting (implicitly)/(widening) automatically converts lower to higher datatype.

        //Type casting (explicitly)/(narrowing) to convert higher to lower datatype.
//        int num = (int)(55.75f);
//        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);  // 257 % 256 = 1 because it was exceeding byte range and it will take how much range capability it has, rest remainder it gives in result.
//
//        System.out.println(b);

//        byte l = 45;
//        byte m = 20;
//        byte n = 35;
//        int o = (l * m) / n;
//
//        System.out.println(o);  // giving correct result i.e because if byte performs multiply operation it will automatically convert into int value so we stored it in int value.
//
//          byte d = 25;
//          d = d * 2; // it was showing error because whenever byte value multiplies its converting to int, but it's storing in byte so that's the reason it's showing error.

//        int number = 'A';
//        System.out.println(number);
//        System.out.println("नमस्ते"); // java supports unicode standard i.e any language and values you can print.

//        System.out.println(6 * 44.556666f); // make sure you follow type promotion rule.

        byte f = 74;
        char c = 'a';
        short s = 1024;
        int i = 45000;
        float g = 5.67f;
        double d = 0.4567;
        double result = (g * f) + (i / c) - (d - s);
        //float + int - double = double i.e it's convert to bigger datatype only.
        System.out.println((g * f) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}
