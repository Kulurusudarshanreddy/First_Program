package com.sidhu;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = in.next();

        /*
           Syntax: For switch case

           switch (expression)
           {
            // cases
            case one:
             //do something
             break;

             case two:
             //do something
             break;

             default:
             //do something

             Note:
             1. cases have to be the same type as expressions, must be a constant or literal.
             2. duplicate case values are not allowed.
             3. break is used to terminate the sequence.
             4. if break is not used, it will continue to next case.
             5. default will execute when none of the above does.
             6. if default is not at the end and if you want to place in between cases, put break after it.., but recommended to place at the last only.
            }
         */

        //one approach to write switch case

//        switch (s){
//            case "mango":
//                System.out.println("summer king");
//                break;
//            case "banana":
//                System.out.println("All time king");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        //another enhanced approach to write the switch case and here break is not required(because break is internally inserted).

//        switch (s) {
//            case "mango" -> System.out.println("summer king");
//            case "banana" -> System.out.println("All time king");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        //Example 2

        //one approach

        int day = in.nextInt();

//        switch (day){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Weekday");
//                break;
//            case 6 :
//            case 7 :
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Please enter a valid day");
//        }

        //another approach

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid day");

        }



    }
}