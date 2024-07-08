package com.AbstractDemos;

public class Circle extends Shape
{
    int rd;

    public Circle(int rd) {
        this.rd = rd;
    }

    @Override
    public void calculateArea() {
        double area = 3.142 * rd * rd;
        System.out.println("Area of Circle: " + area);
    }
}
