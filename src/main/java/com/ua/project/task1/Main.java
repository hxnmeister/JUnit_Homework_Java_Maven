package com.ua.project.task1;

import com.ua.project.task1.interfaces.implementations.Rectangle;
import com.ua.project.task1.interfaces.implementations.Rhombus;
import com.ua.project.task1.interfaces.implementations.Square;
import com.ua.project.task1.interfaces.implementations.Triangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Square square = Square.builder().side(32).build();
        Rhombus rhombus = Rhombus.builder().diagonalSide1(150.3).diagonalSide2(150.3).build();
        Triangle triangle = Triangle.builder().side1(7).side2(5).side3(10).build();
        Rectangle rectangle = Rectangle.builder().height(100).width(50).build();

        System.out.println(" Area of square with side " + square.getSide() + ": " + square.calculateArea());
        System.out.println(" Area of rhombus with diagonal1 " + rhombus.getDiagonalSide1() + " and diagonal2 " + rhombus.getDiagonalSide2() + ": " + rhombus.calculateArea());
        System.out.println(" Area of triangle with side1 " + triangle.getSide1() + ", side2 " + triangle.getSide2() + ", side3 " + triangle.getSide3() + ": " + triangle.calculateArea());
        System.out.println(" Area of rectangle with height " + rectangle.getHeight() + " and width " + rectangle.getWidth() + ": " + rectangle.calculateArea());
    }
}
