package com.sidhu;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two input values");
        int s1 = input.nextInt();
        int s2 = input.nextInt();

        int s = s1 + s2;
        System.out.println("Sum of two numbers is: " +s);
    }
}
