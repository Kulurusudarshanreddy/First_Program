package com.sidhu;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 47935;

        int answer = 0;

        while (num > 0){
            int rem = num % 10;
            num /= 10;

            answer = answer * 10 + rem;
        }
        System.out.println(answer);
    }
}
