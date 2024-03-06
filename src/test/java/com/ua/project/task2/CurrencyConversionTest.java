package com.ua.project.task2;

import com.ua.project.task2.models.CurrencyExchangeRate;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConversionTest {
    static CurrencyConversion currencyConversion = CurrencyConversion.builder().build();

    @Test
    void exchangeCurrency_ShouldReturnConvertedMoney_WhenCalled() {
        currencyConversion.setExchangeRate(CurrencyExchangeRate.builder().euro(41.8).sterling(48.1).dollar(38.4).yen(4.93).build());

        double expected = 640.90;
        Double actual = currencyConversion.exchangeCurrency(130, "jpy");

        assertEquals(expected, actual, 0.01);
    }

    @Test
    void exchangeCurrency_ShouldReturnNull_WhenAbbreviationInvalid() {
        currencyConversion.setExchangeRate(CurrencyExchangeRate.builder().euro(41.8).sterling(48.1).dollar(38.4).yen(4.93).build());

        assertNull(currencyConversion.exchangeCurrency(130, "eui"));
    }

    @Test
    void exchangeCurrency_ShouldThrow_WhenMoneyNegative() {
        currencyConversion.setExchangeRate(CurrencyExchangeRate.builder().euro(41.8).sterling(48.1).dollar(38.4).yen(4.93).build());

        assertThrows(IllegalArgumentException.class, () -> currencyConversion.exchangeCurrency(-13, "eur"));
    }

    @Test
    void exchangeCurrency_ShouldThrow_WhenMoneyZero() {
        currencyConversion.setExchangeRate(CurrencyExchangeRate.builder().euro(41.8).sterling(48.1).dollar(38.4).yen(4.93).build());

        assertThrows(IllegalArgumentException.class, () -> currencyConversion.exchangeCurrency(0, "eur"));
    }
}
