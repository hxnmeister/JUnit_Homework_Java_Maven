package com.ua.project.task4.enums;

import lombok.Getter;

@Getter
public enum UnitOfLength {
    METER(1),
    KILOMETER(1000),
    DECIMETER(0.1),
    CENTIMETER(0.01),
    MILLIMETER(0.001);

    private final double value;

    UnitOfLength(double value) {
        this.value = value;
    }
}
