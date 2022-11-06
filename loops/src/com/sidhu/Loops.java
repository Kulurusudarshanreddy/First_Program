package com.sidhu;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
           why loops
           example:
           if some asks to print 10000 thousand lines of code. Its very hectic to write
           so many lines of code right, and also it consumes more lines of code to read.

           Example question : if i ask print Hello World 5 times
           // Answer will be as below if no loops used. And just imagine to print 10000 lines.
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
         */

        /*
            Syntax of for loops:
            for (initialization; condition; increment/decrement){
               //body
            }
         */

        //Q: print numbers from 1 to 5

//        for (int num=1; num <=5; num += 1){
//            System.out.println(num);
//        }

        //prints numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a value: ");
//        int n = in.nextInt();
//
//        for (int num = 1; num < n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello world");
//        }

        //while loops
        /*
          syntax for while loop

           while(condition){
             //body
           }
         */

//        int n = 1;
//        while (n < 5){
//            System.out.println(n);
//            n += 2;
//        }

        /*
          Note: Q: Do you have a question when to use for loop and while loop?

          Answer : You can use anytime both but if you know the iteration loop times it will execute then use for loop else if you don't know how many times its going to execute then use while loop.
         */

        //do while
        /*
          syntax: for do while loop

          do{
            //body
          } while(condition);
         */

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
        /*
           Difference between while and do while loop

           A: do while loop executes atleast one time irrespective of condition check where while loop won't execute without condition check.
           Example:
           int i = 1;
           do{
            System.out.println("Hello World");
            } while ( i != 1);
         */
    }
}
