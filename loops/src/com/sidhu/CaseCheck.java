package com.sidhu;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0); // taking input as character type.

//        System.out.println(ch);

        /*
        next() is taking next string value.
        trim() is basically remove the space at beginning and end of the string.
        charAt(0) taking character at zero index because array begin with zeroth index.
        */

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }else {
            System.out.println("upper case");
        }

    }
}
