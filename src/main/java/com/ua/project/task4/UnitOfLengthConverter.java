package com.ua.project.task4;

import com.ua.project.task4.enums.UnitOfLength;

public class UnitOfLengthConverter {
    public static double convertMeters(double value, UnitOfLength from, UnitOfLength to) {
        if(from == null || to == null) {
            throw new NullPointerException();
        }
        else {
            double meters = value * from.getValue();
            return meters / to.getValue();
        }
    }
}
