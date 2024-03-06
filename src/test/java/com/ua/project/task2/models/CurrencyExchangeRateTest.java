package com.ua.project.task2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CurrencyExchangeRateTest {
    static CurrencyExchangeRate currencyExchangeRate = CurrencyExchangeRate.builder().build();

    @Test
    void changeExchangeRates_ShouldReturnExchange_WhenCalled() {
        currencyExchangeRate = CurrencyExchangeRate.builder().euro(2).sterling(1).dollar(1).yen(5).build();

        CurrencyExchangeRate expected = CurrencyExchangeRate.builder().euro(40.13).sterling(56.5).dollar(38.7).yen(13.54).build();
        CurrencyExchangeRate actual = currencyExchangeRate.changeExchangeRates(CurrencyExchangeRate.builder().euro(40.13).sterling(56.5).dollar(38.7).yen(13.54).build());

        assertEquals(expected, actual);
    }

    @Test
    void areExchangeRatesValid_ShouldReturnNull_WhenArgIsZero() {
        currencyExchangeRate = CurrencyExchangeRate.builder().euro(10.4).sterling(16.5).dollar(8.7).yen(53.54).build();

        assertNull(currencyExchangeRate.changeExchangeRates(CurrencyExchangeRate.builder().euro(0).sterling(56.5).dollar(38.7).yen(13.54).build()));
    }

    @Test
    void areExchangeRatesValid_ShouldReturnNull_WhenArgIsNegative() {
        currencyExchangeRate = CurrencyExchangeRate.builder().euro(10.4).sterling(16.5).dollar(8.7).yen(53.54).build();

        assertNull(currencyExchangeRate.changeExchangeRates(CurrencyExchangeRate.builder().euro(20.45).sterling(56.5).dollar(-38.7).yen(13.54).build()));
    }
}
