package com.sidhu;

public class ByPassingArguments {
    public static void main(String[] args) {
        int ans = sum2(44, 6);
        System.out.println("Answer: " +ans);
    }
    //pass the value of numbers when you are calling the method in main(with parameters)
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }
}
