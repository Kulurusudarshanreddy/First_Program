package com.sidhu;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String na = in.next();
        String mess = greet(na);
        System.out.println("Given string is: " +mess);
    }

    static String greet(String name) {
        String re = "Hi " + name;
        return re;
    }
}
