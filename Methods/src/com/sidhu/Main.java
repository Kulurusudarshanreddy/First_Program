package com.sidhu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q: Take input of numbers and print the sum
        Scanner in = new Scanner(System.in);

        //one way of approach
//        System.out.println("Please enter the first value: ");
//        int a = in.nextInt();
//        System.out.println("Please enter the second value: ");
//        int b = in.nextInt();
//        int sum = a + b;
//        System.out.println("The sum of two number is: " +sum);

        int a, b, sum;

        System.out.println("Please enter the first value: ");
        a = in.nextInt();
        System.out.println("Please enter the second value: ");
        b = in.nextInt();
        sum = a + b;
        System.out.println("The sum of two number is: " +sum);

        /*
           note:
           1.just imagine if we want to take 1000 people inputs values and
           print the result.
           2. By thinking only its very difficult to write vast lines of code right so,
           we have functions comes into picture. See example in Sum class in this package.
         */
    }
}