package com.epam.tat.module4.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalculatorTest extends BaseCalculatorTest {
    @DataProvider(name = "ctgData")
    public Object[][] ctgData() { return new Object[][] {{ Math.PI / 4, 1.0 }, { Math.PI / 2, 0.0 }}; }

    @Test(dataProvider = "ctgData", groups = {"trigonometry"})
    public void testCtg(double a, double expected) {
        Assert.assertEquals(calculator.ctg(a), expected, 0.0001, "Invalid ctg result");
    }
}