package com.ClasseDemos;

public class Employee
{
    private int empId;
    private String empName;
    private double basicSalary;
    private String gender;
    private static String company;

    public static void setCompany(String c) {
        company = c;
    }

   public Employee()
   {
       System.out.println("Plain / Default / No Parameter Constructor Called");
       empId = 111;
       empName = "Monu";
       basicSalary = 50000;
       gender = "Female";
   }
   public Employee(int empId, String nm, double bs, String gn)
   {
       System.out.println("Parameterized Constructor");
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

    public void setEmpId(int id)    //Mutator / Setter function
    {
        empId = id;
    }
    public int getEmpId()           //Accessor / Getter function
    {
        return empId;
    }

    public void displayData()       //Facilitator Function
    {
        System.out.println("Employee Id  : " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Basic Salary : " + this.basicSalary);
        System.out.println("Gender       : " + this.gender);
        System.out.println("Company      : " + company);
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
