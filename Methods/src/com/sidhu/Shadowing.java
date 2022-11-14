package com.sidhu;

public class Shadowing {
    static int x = 33; // to access inside the main method we declare static. (Global variable we can anywhere in class).
    // above variable will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);  // o/p: 90
        int x ; // the class variable at line 4 is shadowed by this.
//        System.out.println(x); // error because, scope will begin when value is initialised.
        x = 66;
        System.out.println(x);  // o/p: 45 // local variable(scope inside block only)
        ply();
    }

    static void ply(){
        System.out.println(x);
    }
}
