package com.ua.project.task5;

import com.ua.project.task5.enums.UnitOfWeight;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitOfWeightConverterTest {
    @Test
    void convertGrams_ShouldReturnConvertedValue_WhenCalled() {
        double expected = 0.015;
        double actual = UnitOfWeightConverter.convertGrams(15, UnitOfWeight.KILOGRAM, UnitOfWeight.TONNE);

        assertEquals(expected, actual);
    }

    @Test
    void convertGrams_ShouldThrow_WhenToOrFromIsNull() {
        assertThrows(NullPointerException.class, () -> UnitOfWeightConverter.convertGrams(55, UnitOfWeight.KILOGRAM, null));
    }
}
