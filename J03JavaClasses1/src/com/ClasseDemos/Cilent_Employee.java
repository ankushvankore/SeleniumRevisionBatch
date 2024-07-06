package com.ClasseDemos;

public class Cilent_Employee {
    public static void main(String[] args) {
        Employee.setCompany("Persistence");
        Employee e1 = new Employee();
        //Employee -> Class Name / Data Type & e1 -> Object

        e1.setEmpId(101);

        e1.displayData();
        double sal = e1.calculateSalary();
        System.out.println("Net Salary   : " + sal);

        System.out.println("Employee ID: " + e1.getEmpId());

        Employee e2 = new Employee();
        e2.displayData();
        System.out.println("Net Salary   : " + e2.calculateSalary());

        Employee.setCompany("Infosys");

        Employee e3 = new Employee(123, "Ruchi", 55000, "Female");
        e3.displayData();
        System.out.println("Net Salary   : " + e3.calculateSalary());

        Employee e4 = new Employee(234,"Vaishali", 60000);
        e4.displayData();
        System.out.println("Net Salary   : " + e4.calculateSalary());

        e1.displayData();
    }
}
