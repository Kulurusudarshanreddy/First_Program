package com.sidhu;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        // one approach
//        switch (empId){
//            case 1 :
//                System.out.println("First employee");
//                break;
//            case 2 :
//                System.out.println("Second employee");
//                break;
//            case 3 :
//                switch (department){
//                    case "IT" :
//                        System.out.println("IT dep");
//                        break;
//                    case "Management" :
//                        System.out.println("Man dept");
//                        break;
//                    default:
//                        System.out.println("NO department exists");
//                }
//                break;
//            default:
//                System.out.println("Enter a valid employee number");
//        }


        //another approach

        switch (empId) {
            case 1:
                System.out.println("First employee");
                break;
            case 2:
                System.out.println("Second employee");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT dep");
                    case "Management" -> System.out.println("Man dept");
                    default -> System.out.println("NO department exists");
                }
                break;
            default:
                System.out.println("Enter a valid employee number");
        }

    }
}
