package com.epam.tat.module4.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseCalculatorTest {
    @DataProvider(name = "sinData")
    public Object[][] sinData() { return new Object[][] {{ 0.0, 0.0 }, { Math.PI / 2, 1.0 }}; }

    @Test(dataProvider = "sinData", groups = {"trigonometry"})
    public void testSin(double a, double expected) {
        Assert.assertEquals(calculator.sin(a), expected, 0.0001, "Invalid sin result");
    }
}