package com.ua.project.task1.interfaces.implementations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    Square square = Square.builder().build();

    @Test
    void calculateArea_ShouldReturnArea_WhenCalled() {
        square = Square.builder().side(30).build();
        double expected = 900;
        double actual = square.calculateArea();

        assertEquals(expected, actual);
    }

    @Test
    void calculateArea_ShouldThrow_WhenZeroAsArg() {
        square = Square.builder().side(0).build();

        assertThrows(IllegalArgumentException.class, square::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenNegativeAsArg() {
        square = Square.builder().side(-40).build();

        assertThrows(IllegalArgumentException.class, square::calculateArea);
    }
}
