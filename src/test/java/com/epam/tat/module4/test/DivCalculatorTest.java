package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "divLongData")
    public Object[][] divLongData() {
        return new Object[][] {
                { 10L, 2L, 5L },
                { -10L, 5L, -2L }
        };
    }

    @Test(dataProvider = "divLongData", groups = {"division"})
    public void testDivLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected, "Invalid result of long division");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = {"division"})
    public void testDivByZero() {
        calculator.div(10L, 0L);
    }
}