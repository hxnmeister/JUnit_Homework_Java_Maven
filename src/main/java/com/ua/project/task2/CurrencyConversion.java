package com.ua.project.task2;

import com.ua.project.task2.models.CurrencyExchangeRate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {
    private CurrencyExchangeRate exchangeRate;

    public Double exchangeCurrency(double money, String currencyAbbreviation) {
        if(money <= 0) {
            throw new IllegalArgumentException();
        }
        else if(currencyAbbreviation == null) {
            throw new NullPointerException();
        }

        return switch(currencyAbbreviation.toUpperCase()) {
            case "USD" -> money * exchangeRate.getDollar();
            case "EUR" -> money * exchangeRate.getEuro();
            case "GBR" -> money * exchangeRate.getSterling();
            case "JPY" -> money * exchangeRate.getYen();
            default -> null;
        };
    }
}
