package com.ua.project.task4;

import com.ua.project.task4.enums.UnitOfLength;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitOfLengthConverterTest {
    @Test
    void convertMeters_ShouldReturnConvertedValue_WhenCalled() {
        double expected = 0.0004;
        double actual = UnitOfLengthConverter.convertMeters(4, UnitOfLength.DECIMETER, UnitOfLength.KILOMETER);

        assertEquals(expected, actual);
    }

    @Test
    void convertMeters_ShouldThrow_WhenFromOrToIsNull() {
        assertThrows(NullPointerException.class, () -> UnitOfLengthConverter.convertMeters(4, null, UnitOfLength.KILOMETER));
    }
}
