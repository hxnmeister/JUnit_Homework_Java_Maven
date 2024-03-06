package com.ua.project.task1.interfaces.implementations;

import com.ua.project.task1.exceptions.CannotFormRhombusException;
import com.ua.project.task1.exceptions.CannotFormTriangleException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RhombusTest {
    Rhombus rhombus = Rhombus.builder().build();

    @Test
    void calculateArea_ShouldReturnArea_WhenCalled() {
        rhombus = Rhombus.builder().diagonalSide1(25).diagonalSide2(25).build();
        double expected = 312.5;
        double delta = 0.01;
        double actual = rhombus.calculateArea();

        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateArea_ShouldReturnException_WhenZeroAsArg() {
        rhombus = Rhombus.builder().diagonalSide1(0).diagonalSide2(25).build();

        assertThrows(IllegalArgumentException.class, rhombus::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenNegativeAsArg() {
        rhombus = Rhombus.builder().diagonalSide1(10).diagonalSide2(-10).build();

        assertThrows(IllegalArgumentException.class, rhombus::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenCannotFormRhombus() {
        rhombus = Rhombus.builder().diagonalSide1(10).diagonalSide2(11).build();

        assertThrows(CannotFormRhombusException.class, rhombus::calculateArea);
    }
}
