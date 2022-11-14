package com.sidhu;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int an = sum2();  //calling method/functions
        int res = sum2(); // calling method (second time)
        /*note: you can call the method how many times you want with different inputs with customers.
         This way we can reduce to write the multiple lines of code for same operation. */
        System.out.println("Return value is: " +an);
        System.out.println("Second time result is: " +res);
    }

    /*
       method syntax:
       access modifiers return type name(){
          //body
          return value;
       }
     */


        // function/method with no return value(one way approach).
//        static void sum() {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Please enter the first value: ");
//            int a = in.nextInt();
//            System.out.println("Please enter the second value: ");
//            int b = in.nextInt();
//            int total = a + b;
//            System.out.println("The sum of two number is: " + total);
//        }

    // method with return the value.
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first value: ");
        int a = in.nextInt();
        System.out.println("Please enter the second value: ");
        int b = in.nextInt();
        int total = a + b;
        return total;
    }
}
