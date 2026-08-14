package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "negativeData")
    public Object[][] negativeData() {
        return new Object[][] {
                { -10L, true },
                { 5L, false },
                { 0L, false }
        };
    }

    @Test(dataProvider = "negativeData", groups = {"boolean_checks"})
    public void testIsNegative(long a, boolean expected) {
        Assert.assertEquals(calculator.isNegative(a), expected, "Invalid isNegative result");
    }
}