package com.ua.project.task2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeRate {
    private double yen;
    private double euro;
    private double dollar;
    private double sterling;

    private boolean areExchangeRatesValid(CurrencyExchangeRate exchangeRate) {
        return exchangeRate.getDollar() > 1 && exchangeRate.getEuro() > 1 && exchangeRate.getSterling() > 1 && exchangeRate.getYen() > 1;
    }

    public CurrencyExchangeRate changeExchangeRates(CurrencyExchangeRate exchangeRate) {
        if(areExchangeRatesValid(exchangeRate)) {
            this.yen = exchangeRate.getYen();
            this.euro = exchangeRate.getEuro();
            this.dollar = exchangeRate.getDollar();
            this.sterling = exchangeRate.getSterling();

            return this;
        }

        return null;
    }
}
