package com.ua.project.task1.interfaces.implementations;

import com.ua.project.task1.exceptions.CannotFormTriangleException;
import com.ua.project.task1.interfaces.GeometryFiguresAreaCalculator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Triangle implements GeometryFiguresAreaCalculator {
    double side1;
    double side2;
    double side3;

    private boolean canFormTriangle() {
        double maxSide = Double.max(Double.max(side1, side2), side3);
        double minSide1 = 0.0;
        double minSide2 = 0.0;

        if(maxSide == side1) {
            minSide1 = side2;
            minSide2 = side3;
        }
        else if (maxSide == side2) {
            minSide1 = side1;
            minSide2 = side3;
        }
        else if(maxSide == side3) {
            minSide1 = side1;
            minSide2 = side2;
        }

        return minSide1 + minSide2 != maxSide;
    }

    public double calculateArea() {
        if(side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException();
        }
        else if(!canFormTriangle()) {
            throw new CannotFormTriangleException(side1, side2, side3);
        }

        final double SEMIPERIMETR = (side1 + side2 + side3) / 2;
        return Math.sqrt(SEMIPERIMETR * (SEMIPERIMETR - side1) * (SEMIPERIMETR - side2) * (SEMIPERIMETR - side3));
    }
}
