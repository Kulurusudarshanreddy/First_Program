package com.sidhu;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: Find the largest of three numbers

        //one method (you can solve with so many ways)
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        //another way of logic
//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }

        //another way
        int max = Math.max(c, Math.max(a,b));
         //Math.max(a, b) -- it will compare both a and b values, and it will maximize the value.
        System.out.println(max);
    }
}
