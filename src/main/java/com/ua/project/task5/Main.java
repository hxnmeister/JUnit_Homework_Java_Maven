package com.ua.project.task5;

import com.ua.project.task5.enums.UnitOfWeight;

public class Main {
    public static void main(String[] args) {
        double convertingValue = 57;

        System.out.println(" " + convertingValue + " Kilogram into tonne: " + UnitOfWeightConverter.convertGrams(15, UnitOfWeight.KILOGRAM, UnitOfWeight.TONNE));
    }
}
