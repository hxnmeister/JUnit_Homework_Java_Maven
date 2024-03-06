package com.ua.project.task1.interfaces.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    static Rectangle rectangle = Rectangle.builder().build();

    @Test
    void calculateArea_ShouldReturnArea_WhenArgsEqual() {
        rectangle = Rectangle.builder().width(200).height(200).build();
        double expected = 40000;
        double actual = rectangle.calculateArea();

        assertEquals(expected, actual);
    }

    @Test
    void calculateArea_ShouldReturnArea_WhenArgsDifferent() {
        rectangle = Rectangle.builder().width(200).height(350).build();
        double expected = 70000;
        double actual = rectangle.calculateArea();

        assertEquals(expected, actual);
    }

    @Test
    void calculateArea_ShouldThrow_WhenNegativeAsArg() {
        rectangle = Rectangle.builder().width(200).height(-50).build();

        assertThrows(IllegalArgumentException.class, rectangle::calculateArea);
    }

    @Test
    void calculateArea_ShouldThrow_WhenZeroAsArg() {
        rectangle = Rectangle.builder().width(0).height(150).build();

        assertThrows(IllegalArgumentException.class, rectangle::calculateArea);
    }
}
