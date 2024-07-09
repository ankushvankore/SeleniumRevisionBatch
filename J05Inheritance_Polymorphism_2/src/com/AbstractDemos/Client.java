package com.AbstractDemos;

public class Client {
    public static void main(String[] args) {
        //Shape s1 = new Shape();
        Shape s1 = new Circle(5);
        s1.calculateArea();

        Circle c1 = new Circle(8);
        c1.calculateArea();
        c1.print();

        s1 = new Triangle(5, 6);
        s1.calculateArea();

        s1.sayHello();

        c1.sayHello();

        //Printable p1 = new Printable();
        Printable p1 = new Triangle(5, 7);
        p1.print();
    }
}
