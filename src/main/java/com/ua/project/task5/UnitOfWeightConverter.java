package com.ua.project.task5;

import com.ua.project.task5.enums.UnitOfWeight;

public class UnitOfWeightConverter {
    public static double convertGrams(double value, UnitOfWeight from, UnitOfWeight to) {
        if(from == null || to == null) {
            throw new NullPointerException();
        }
        else {
            double gram = value * from.getValue();
            return gram / to.getValue();
        }
    }
}
