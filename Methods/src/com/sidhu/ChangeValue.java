package com.sidhu;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array (Array is just collection of integers/numbers).

        int[] arr = {4,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 33; // if you make a change to the object via this ref variable, same object will be changed.
    }
}
