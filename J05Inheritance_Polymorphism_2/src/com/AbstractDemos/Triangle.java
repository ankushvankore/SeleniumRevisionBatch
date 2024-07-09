package com.AbstractDemos;

public class Triangle extends Shape implements Printable
{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void print() {
        System.out.println("This is Triangle class!!!");
    }
}
