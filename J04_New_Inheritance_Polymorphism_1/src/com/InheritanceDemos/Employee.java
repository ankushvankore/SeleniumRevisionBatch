package com.InheritanceDemos;

public class Employee {
    private int empId;
    private String empName;
    protected double basicSalary;
    private String gender;

    public Employee()
    {
        empId = 111;
        empName = "Monu";
        basicSalary = 50000;
        gender = "Female";
    }
    public Employee(int empId, String nm, double bs, String gn)
    {
        this.empId = empId;
        empName = nm;
        basicSalary = bs;
        gender = gn;
    }

    public Employee(int id, String nm, double bs)
    {
        System.out.println("Another Parameterized Constructor");
        empId = id;
        empName = nm;
        basicSalary = bs;
        gender = "Female";
    }

    public void displayData()       //Facilitator Function
    {
        System.out.println("Employee Id  : " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Basic Salary : " + this.basicSalary);
        System.out.println("Gender       : " + this.gender);
    }

    public double calculateSalary()
    {
        double da, hra, pf, net;

        da = basicSalary * 0.50;
        hra = basicSalary * 0.20;
        pf = basicSalary * 0.05;
        net = basicSalary + da + hra - pf;

        return net;
    }
}
