package com.ua.project.task1.interfaces.implementations;

import com.ua.project.task1.interfaces.GeometryFiguresAreaCalculator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle implements GeometryFiguresAreaCalculator {
    private double width;
    private double height;

    public double calculateArea() {
        if(width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }

        return width == height ? Math.pow(height, 2) : width * height;
    }
}
