package com.ua.project.task5.enums;

import lombok.Getter;

@Getter
public enum UnitOfWeight {
    GRAM(1),
    MILLIGRAM(0.001),
    KILOGRAM(1000),
    CENTNER(100000),
    TONNE(1000000);

    private final double value;

    UnitOfWeight(double value) {
        this.value = value;
    }
}
