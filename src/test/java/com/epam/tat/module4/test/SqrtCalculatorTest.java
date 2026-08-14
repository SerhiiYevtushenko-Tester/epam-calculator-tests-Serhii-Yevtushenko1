package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "sqrtData")
    public Object[][] sqrtData() {
        return new Object[][] {
                { 9.0, 3.0 },
                { 16.0, 4.0 },
                { 0.0, 0.0 }
        };
    }

    @Test(dataProvider = "sqrtData", groups = {"exponentiation"})
    public void testSqrt(double a, double expected) {
        Assert.assertEquals(calculator.sqrt(a), expected, 0.0001, "Invalid sqrt result");
    }
}