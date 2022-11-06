package com.sidhu;

public class Conditionals {
    public static void main(String[] args) {

        // single line comment

        /*
        multi line comment
         */

        /*
             Syntax of if statement:
             if (boolean expression True or False){
                //body
             } else {
               // else do this
             }
         */

        int salary = 100000;
//        if(salary > 50000){
//            salary = salary + 15000;
//        } else {
//            salary = salary + 5000;
//        }

        // multiple if-else statements

        /*
          Note:
          It will execute sequentially if condition satisfies first only it will enter into loop,
          and it will generate output and exit out of the loop.

          It will not check other conditions.

          So to check other condition use multiple if statements
          Example:
          int num = 50000;
          if (num > 30000){
            num += 5000;
          } if (num > 40000){
            num += 10000;
          }
         */

        if (salary > 50000){
            salary += 15000; // salary = salary + 15000;
        } else if (salary > 90000) {
            salary += 25000;
        }else {
            salary += 10000;
        }

        System.out.println("New Salary: " +salary);

    }
}
