package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "multLongData")
    public Object[][] multLongData() {
        return new Object[][] {
                { 5L, 5L, 25L },
                { 5L, -2L, -10L },
                { 0L, 100L, 0L }
        };
    }

    @Test(dataProvider = "multLongData", groups = {"multiplication", "smoke"})
    public void testMultLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected, "Invalid result of long multiplication");
    }

    @DataProvider(name = "multDoubleData")
    public Object[][] multDoubleData() {
        return new Object[][] {
                { 2.5, 2.0, 5.0 },
                { -1.5, 2.0, -3.0 }
        };
    }

    @Test(dataProvider = "multDoubleData", groups = {"multiplication"})
    public void testMultDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a, b), expected, 0.0001, "Invalid result of double multiplication");
    }
}