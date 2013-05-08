package com.amazon.money.dependency;

public interface CurrencyServiceInterface {
    public int convertAmount(String sourceCurrency, String destinationCurrency, int amount);
}
