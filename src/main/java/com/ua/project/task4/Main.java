package com.ua.project.task4;

import com.ua.project.task4.enums.UnitOfLength;

public class Main {
    public static void main(String[] args) {
        double convertingValue = 3.4;

        try {
            System.out.print(" " + convertingValue + " Decimeters in centimeters: " + UnitOfLengthConverter.convertMeters(convertingValue, UnitOfLength.DECIMETER, UnitOfLength.CENTIMETER));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
