package com.sidhu;

public class ScopingForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);  // can access i inside the loop.
        }
//        System.out.println(i); // cannot access i outside the for loop
    }

    /*
      Note:
      1. Anything initialized outside the block can be used inside the block but anything initialized inside the block cannot be used outside the block.
      2. Similarly, anything initialized outside the block cannot be again initialized inside the block.But anything initialized inside the block can definitely initialize again outside the block.
     */
}
