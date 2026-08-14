package com.epam.tat.module4.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseCalculatorTest {
    @DataProvider(name = "cosData")
    public Object[][] cosData() { return new Object[][] {{ 0.0, 1.0 }, { Math.PI, -1.0 }}; }

    @Test(dataProvider = "cosData", groups = {"trigonometry"})
    public void testCos(double a, double expected) {
        Assert.assertEquals(calculator.cos(a), expected, 0.0001, "Invalid cos result");
    }
}