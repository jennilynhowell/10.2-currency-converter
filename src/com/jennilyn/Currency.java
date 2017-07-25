package com.jennilyn;

import com.jennilyn.Abstract.Conversions;

import java.text.DecimalFormat;

public class Currency extends Conversions {

    String type;
    double value;

    public Currency(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public double convert(String toWhatCurrency){
        double result = 0.0;
        double convertCurrencyValueToUsd = 0.0;
        String pattern = "###,###,###.##";
        DecimalFormat df = new DecimalFormat(pattern);

        if (this.type == "USD"){
            convertCurrencyValueToUsd = this.value;
        } else if (this.type == "EUR"){
            convertCurrencyValueToUsd = eurToUsd(this.value);
        } else if (this.type == "BTC"){
            convertCurrencyValueToUsd = xbtToUsd(this.value);
        } else {
            convertCurrencyValueToUsd = yenToUsd(this.value);
        }

        switch (toWhatCurrency){
            case "USD":
                result = convertCurrencyValueToUsd;
                break;
            case "EUR":
                result = eurFromUsd(convertCurrencyValueToUsd);
                break;
            case "BTC":
                result = xbtFromUsd(convertCurrencyValueToUsd);
                break;
            case"JPY":
                result = yenFromUsd(convertCurrencyValueToUsd);
                break;
        }

        Double finalResult = Double.parseDouble(df.format(result));
        System.out.println("Converted " + this.type);
        System.out.println("To " + toWhatCurrency);
        System.out.println("Result: " + finalResult);
        return finalResult;
    }



}
