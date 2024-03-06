package com.ua.project.task1.interfaces.implementations;

import com.ua.project.task1.exceptions.CannotFormRhombusException;
import com.ua.project.task1.interfaces.GeometryFiguresAreaCalculator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rhombus implements GeometryFiguresAreaCalculator {
    private double diagonalSide1;
    private double diagonalSide2;

    @Override
    public double calculateArea() {
        if(diagonalSide1 <= 0 || diagonalSide2 <= 0) {
            throw new IllegalArgumentException();
        }
        else if(diagonalSide1 != diagonalSide2) {
            throw new CannotFormRhombusException(diagonalSide1, diagonalSide2);
        }

        return (diagonalSide1 * diagonalSide2) / 2; 
    }
}
