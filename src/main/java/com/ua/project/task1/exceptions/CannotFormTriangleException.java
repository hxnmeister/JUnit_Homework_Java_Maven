package com.ua.project.task1.exceptions;

public class CannotFormTriangleException extends RuntimeException {
    public CannotFormTriangleException(String message) {
        super(message);
    }
    public CannotFormTriangleException(double side1, double side2, double side3) {
        this(" It is not possible to form a triangle with these parameters " + side1 + " : " + side2 + " : " + side3 + ".\n It is necessary that one of the sides is less than the sum of the other two!");
    }
    public CannotFormTriangleException() {
        this(" It is necessary that one of the sides is less than the sum of the other two!");
    }
}
