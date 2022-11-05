package com.sidhu;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a value: ");
//        int rollNO = input.nextInt();
//        System.out.println("You are roll number is " + rollNO);

//        int a = 24_000_000;
//        System.out.println(a);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
