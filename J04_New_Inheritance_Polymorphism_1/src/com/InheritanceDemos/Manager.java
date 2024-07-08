package com.InheritanceDemos;

public class Manager extends Employee
{
    double sales;
    double rate;

    public Manager()
    {
        sales = 0;
        rate = 0;
        System.out.println("Manager -> Plain");
    }

    public Manager(int empId, String nm, double bs, String gn, double sl, double rt)
    {
        super(empId, nm, bs, gn);           //Call parameterized constructor of Employee Class
        sales = sl;
        rate = rt;
    }

    public void displayData()
    {
        super.displayData();            //Call displayData() of Employee class
        System.out.println("Total Sales  : " + sales);
        System.out.println("Rate of Comm : " + rate);
        System.out.println(basicSalary);
    }

    public double calculateInsentive()
    {
        return sales * rate;
    }

    public double calculateSalary()
    {
        double net = super.calculateSalary() + calculateInsentive();
        return net;
    }
}
