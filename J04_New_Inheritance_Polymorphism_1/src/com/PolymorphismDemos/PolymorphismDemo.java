package com.PolymorphismDemos;

import com.InheritanceDemos.Employee;
import com.InheritanceDemos.Manager;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee emp;           //Reference of Employee class // Generic Reference
        Employee e1 = new Employee();
        Manager m1 = new Manager(123, "Sarvesh", 50000, "Male", 50000, 0.05);
        //Object of Manager class

        emp = e1;
        //Generic Reference -> Reference of base class which can hold object of derived class
        emp.displayData();

        emp = m1;
        emp.displayData();

        Employee emp2 = new Manager();

    }
}
