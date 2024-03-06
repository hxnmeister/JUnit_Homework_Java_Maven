package com.ua.project.task1.exceptions;

public class CannotFormRhombusException extends RuntimeException {
    public CannotFormRhombusException(String message) {
        super(message);
    }
    public CannotFormRhombusException(double diagonalSide1, double diagonalSide2) {
        this(" Cannot build rhombus with these parameters " + diagonalSide1 + " : " + diagonalSide2 + ".\n The diagonals of a rhombus must be equal to form a figure!");
    }
    public CannotFormRhombusException() {
        this(" The diagonals of a rhombus must be equal to form a figure!");
    }
}
