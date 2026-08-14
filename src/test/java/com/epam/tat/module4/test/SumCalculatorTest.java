package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "sumLongData")
    public Object[][] sumLongData() {
        return new Object[][] {
                { 10L, 5L, 15L },
                { -5L, 5L, 0L },
                { 0L, 0L, 0L }
        };
    }

    @Test(dataProvider = "sumLongData", groups = {"addition", "smoke"})
    public void testSumLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, "Invalid result of long addition");
    }

    @DataProvider(name = "sumDoubleData")
    public Object[][] sumDoubleData() {
        return new Object[][] {
                { 2.5, 2.5, 5.0 },
                { -1.5, 1.5, 0.0 }
        };
    }

    @Test(dataProvider = "sumDoubleData", groups = {"addition"})
    public void testSumDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, 0.0001, "Invalid result of double addition");
    }
}