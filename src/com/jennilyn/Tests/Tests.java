package com.jennilyn.Tests;

import static org.junit.Assert.*;

import com.jennilyn.Abstract.Conversions;
import com.jennilyn.Currency;
import org.junit.Test;

public class Tests {
    @Test
    public void sanityTest(){
        assertEquals(6, 6);
    }

    @Test
    public void returningProperConversionsUSD(){
        Currency myUsWallet = new Currency("USD", 10);
        double delta = 0.05;

        assertEquals(0.004, myUsWallet.convert("BTC"), delta);
        assertEquals(1119.16, myUsWallet.convert("JPY"), delta);
        assertEquals(8.58, myUsWallet.convert("EUR"), delta);

    }

    @Test
    public void returningProperConversionsBTC(){
        Currency myBtcWallet = new Currency("BTC", 1);
        double delta = 0.05;

        assertEquals(2475.52, myBtcWallet.convert("USD"), delta);
        assertEquals(277050.65, myBtcWallet.convert("JPY"), delta);
        assertEquals(2125.71, myBtcWallet.convert("EUR"), delta);

    }

    @Test
    public void returningProperConversionsEUR(){
        Currency myEuWallet = new Currency("EUR", 30);
        double delta = 0.05;

        assertEquals(34.93, myEuWallet.convert("USD"), delta);
        assertEquals(3910.00, myEuWallet.convert("JPY"), delta);
        assertEquals(0.014, myEuWallet.convert("BTC"), delta);

    }

    @Test
    public void returningProperConversionsJPY(){
        Currency myYenWallet = new Currency("JPY", 1000);
        double delta = 0.05;

        assertEquals(8.93, myYenWallet.convert("USD"), delta);
        assertEquals(7.67, myYenWallet.convert("EUR"), delta);
        assertEquals(0.0036, myYenWallet.convert("BTC"), delta);

    }


}
