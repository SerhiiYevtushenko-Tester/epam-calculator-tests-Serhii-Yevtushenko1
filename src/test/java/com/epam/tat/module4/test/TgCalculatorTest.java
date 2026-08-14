package com.epam.tat.module4.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalculatorTest extends BaseCalculatorTest {
    @DataProvider(name = "tgData")
    public Object[][] tgData() { return new Object[][] {{ 0.0, 0.0 }, { Math.PI / 4, 1.0 }}; }

    @Test(dataProvider = "tgData", groups = {"trigonometry"})
    public void testTg(double a, double expected) {
        Assert.assertEquals(calculator.tg(a), expected, 0.0001, "Invalid tg result");
    }
}