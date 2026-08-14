package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "powData")
    public Object[][] powData() {
        return new Object[][] {
                { 2.0, 3.0, 8.0 },
                { 5.0, 0.0, 1.0 },
                { 2.0, -2.0, 0.25 }
        };
    }

    @Test(dataProvider = "powData", groups = {"exponentiation"})
    public void testPow(double a, double b, double expected) {
        Assert.assertEquals(calculator.pow(a, b), expected, 0.0001, "Invalid pow result");
    }
}