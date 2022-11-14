package com.sidhu;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        boolean ans1 = isArmstrong(n);
        System.out.println(ans1);
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        if (c * c > n){
            return true;
        }
        return false;
    }

    // Armstrong number: Means cube of every given number and add the numbers = result(if this is same as given number then it is armstrongnumber).

    static boolean isArmstrong(int n){
        int Original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum += rem*rem*rem;
        }

        // one way approach
//        if (sum == Original){
//            return true;
//        }
//        return false;

        // other way approach
        return sum == Original;
    }


}
