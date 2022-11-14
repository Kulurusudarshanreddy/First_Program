package com.sidhu;

public class Scoping {
    public static void main(String[] args) {
        // Scoping means where we can accessible the variables.

        int a = 10;
        int b = 18;
        String name = "REEDY";
        System.out.println(a + ' ' + b);   // ' ' ascii value is 32 so, o/p: 60.
        System.out.println(name);

        {
            //blocks

//            int a = 65; // already initialised outside the block in the same method, hence you cannot initialise again.

              a = 15; // you can reassign the already initialised variable value to some other value.(We can print inside as well as outside block).
              name = "KIng";
            System.out.println(name);
              int c = 55;
              // values initialised in this block, will remain in block
        }

        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block.
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this function scope only.
    }
}
