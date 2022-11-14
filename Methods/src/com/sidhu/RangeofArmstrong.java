package com.sidhu;

public class RangeofArmstrong {
    /*Armstrong number: Means cube of every given number and add the numbers =
    result(if this is same as given number then it is armstrongnumber).
     */
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int i){
        int Original = i;
        int sum = 0;

        while (i > 0){
            int rem = i % 10;
            i = i / 10;
            sum += rem*rem*rem;
        }

        return sum == Original;
    }
}
