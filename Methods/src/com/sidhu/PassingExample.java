package com.sidhu;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Sidhu";
        pas(name);  // value is passed by reference (i.e, Sidhu).
    }

    static void pas(String naam)
    {
        System.out.println(naam); // o/p: Sidhu
        naam = "RR";  // Creating a new object (i.e, we cannot change string values i.e, immutable), naam is now pointing to new object i.e, RR. And we can print this naam only inside this function(scope).
    }

    /*
      Note:
      1. Primitives: int, short, char, byte   --- just passing value
      2. Objects and references: passing value of the reference variable pointing to the same object.
     */
}

