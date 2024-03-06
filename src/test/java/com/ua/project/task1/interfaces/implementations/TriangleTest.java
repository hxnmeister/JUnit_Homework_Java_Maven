package com.ua.project.task1.interfaces.implementations;

import com.ua.project.task1.exceptions.CannotFormTriangleException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    static Triangle triangle = Triangle.builder().build();

    @Test
    void calculateArea_ShouldReturnArea_WhenCalled() {
        triangle = Triangle.builder().side1(10).side2(15).side3(10).build();
        double expected = 49.60;
        double delta = 0.01;
        double actual = triangle.calculateArea();

        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateArea_ShouldReturnException_WhenZeroAsArg() {
        triangle = Triangle.builder().side1(10).side2(0).side3(10).build();

        assertThrows(IllegalArgumentException.class, triangle::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenNegativeAsArg() {
        triangle = Triangle.builder().side1(-10).side2(15).side3(10).build();

        assertThrows(IllegalArgumentException.class, triangle::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenCannotFormTriangle() {
        triangle = Triangle.builder().side1(5).side2(2).side3(3).build();

        assertThrows(CannotFormTriangleException.class, triangle::calculateArea);
    }
}
