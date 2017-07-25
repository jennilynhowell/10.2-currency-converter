package com.jennilyn.Abstract;

public abstract class Conversions {

    private double yenUsdConversion = 0.00895507;
    private double eurUsdConversion = 0.858250;
    private double xbtUsdConversion = 2500.24;

    public double convertToUsd(double amountOfForeignCurrency, double conversionRate){
        return amountOfForeignCurrency * conversionRate;
    }

    public double convertFromUsd(double amountOfDollars, double conversionRate) {
        return amountOfDollars / conversionRate;
    }

    public double yenToUsd(double amountOfYen){
        return convertToUsd(amountOfYen, yenUsdConversion);
    }

    public double eurToUsd(double amountOfEuros){
        return convertToUsd(amountOfEuros, eurUsdConversion);
    }

    public double xbtToUsd(double amountOfBitcoin){
        return convertToUsd(amountOfBitcoin, xbtUsdConversion);
    }

    public double yenFromUsd(double amountOfDollars){
        return convertFromUsd(amountOfDollars, yenUsdConversion);
    }

    public double eurFromUsd(double amountOfDollars){
        return convertFromUsd(amountOfDollars, eurUsdConversion);
    }

    public double xbtFromUsd(double amountOfDollars){
        return convertFromUsd(amountOfDollars, xbtUsdConversion);
    }


}
