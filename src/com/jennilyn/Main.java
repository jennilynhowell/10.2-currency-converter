package com.jennilyn;

public class Main {

    public static void main(String[] args) {

        Currency dollars = new Currency("USD", 200);
        dollars.convert("BTC");
        dollars.convert("EUR");
        dollars.convert("JPY");

        Currency euros = new Currency("EUR", 200);
        euros.convert("BTC");
        euros.convert("USD");
        euros.convert("JPY");

        Currency bitcoin = new Currency("BTC", 2.0);
        bitcoin.convert("EUR");
        bitcoin.convert("USD");
        bitcoin.convert("JPY");

        Currency yen = new Currency("JPY", 2000);
        yen.convert("EUR");
        yen.convert("USD");
        yen.convert("BTC");
        yen.convert("ABC");

    }
}
