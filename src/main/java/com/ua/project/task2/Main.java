package com.ua.project.task2;

import com.ua.project.task2.models.CurrencyExchangeRate;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double moneyForExchange = random.nextDouble(100, 400);
        CurrencyExchangeRate exchangeRate = CurrencyExchangeRate.builder().euro(40.13).sterling(56.5).dollar(38.7).yen(13.54).build();
        CurrencyConversion currencyConversion = CurrencyConversion.builder().exchangeRate(exchangeRate).build();

        System.out.println(" Exchanging " + moneyForExchange + " UAH by rate " + exchangeRate.getYen() + " JPY: " + currencyConversion.exchangeCurrency(moneyForExchange, "JPY"));
        System.out.println(" Exchanging " + moneyForExchange + " UAH by rate " + exchangeRate.getEuro() + " EUR: " + currencyConversion.exchangeCurrency(moneyForExchange, "eur"));
        System.out.println(" Exchanging " + moneyForExchange + " UAH by rate " + exchangeRate.getDollar() + " USD: " + currencyConversion.exchangeCurrency(moneyForExchange, "usd"));
        System.out.println(" Exchanging " + moneyForExchange + " UAH by rate " + exchangeRate.getSterling() + " GBR: " + currencyConversion.exchangeCurrency(moneyForExchange, "GBR"));
    }
}
