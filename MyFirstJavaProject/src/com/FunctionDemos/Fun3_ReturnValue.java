package com.FunctionDemos;

public class Fun3_ReturnValue
{
    public static double areaCircle(int rd)
    {
        double area = 3.142 * rd * rd;
        return area;
    }

    public static void main(String[] args) {
        double ar = areaCircle(5);
        System.out.println("Area: " + ar);
    }
}
