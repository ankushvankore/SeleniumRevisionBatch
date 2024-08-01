package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass
{
    @Test(priority = 1)
    public void second()
    {
        System.out.println("My Second Test");
        Assert.assertTrue(true);
    }
    @Test(priority = 2)
    public void firstTest()
    {
        System.out.println("My First Test");
        Assert.assertTrue(false);
    }
    @Test(priority =3 , dependsOnMethods = {"firstTest", "second"})
    public void demoTest()
    {
        System.out.println("Demo Test");
    }
}
