package com.sidhu;

import java.util.Scanner;

public class TemperatureExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius: ");
        float tempCelsius = input.nextFloat();
        float tempFahrenheit = (tempCelsius * 9/5) + 32;  // formula to convert degree celsius to fahrenheit.
        System.out.println(tempFahrenheit);
    }
}
