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
public class Square implements GeometryFiguresAreaCalculator {
    private double side;

    public double calculateArea() {
        if(side <= 0) {
            throw new IllegalArgumentException();
        }

        return Math.pow(side, 2);
    }
}
