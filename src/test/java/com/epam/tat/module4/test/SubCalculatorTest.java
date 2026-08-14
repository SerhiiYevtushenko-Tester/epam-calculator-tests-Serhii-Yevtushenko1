package com.epam.tat.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "subLongData")
    public Object[][] subLongData() {
        return new Object[][] {
                { 10L, 5L, 5L },
                { 0L, 5L, -5L },
                { -10L, -10L, 0L }
        };
    }

    @Test(dataProvider = "subLongData", groups = {"subtraction", "smoke"})
    public void testSubLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected, "Invalid result of long subtraction");
    }

    @DataProvider(name = "subDoubleData")
    public Object[][] subDoubleData() {
        return new Object[][] {
                { 5.5, 2.0, 3.5 },
                { -1.5, -1.5, 0.0 }
        };
    }

    @Test(dataProvider = "subDoubleData", groups = {"subtraction"})
    public void testSubDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sub(a, b), expected, 0.0001, "Invalid result of double subtraction");
    }
}