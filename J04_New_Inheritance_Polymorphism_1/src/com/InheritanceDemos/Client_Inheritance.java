package com.InheritanceDemos;

public class Client_Inheritance {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.displayData();
        System.out.println("Net Salary   : " + m1.calculateSalary());

        System.out.println("=======================================");

        Manager m2 = new Manager(123, "Vaishali", 55000, "Female", 50000, 0.05);
        m2.displayData();
        System.out.println("Net Salary   : " + m2.calculateSalary());


    }
}
