package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "positiveData")
    public Object[][] positiveData() {
        return new Object[][] {
                { 10L, true },
                { -5L, false },
                { 0L, false }
        };
    }

    @Test(dataProvider = "positiveData", groups = {"boolean_checks"})
    public void testIsPositive(long a, boolean expected) {
        Assert.assertEquals(calculator.isPositive(a), expected, "Invalid isPositive result");
    }
}