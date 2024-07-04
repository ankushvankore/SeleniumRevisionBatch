package com.FunctionDemos;

public class Fun5
{
    public static void calAddition(int n1, int n2)
    {
        int sum = n1 + n2;
        System.out.println("Addition: " + sum);
    }
    public static void calAddition(int n1, int n2, int n3)
    {
        int sum = n1 + n2 + n3;
        System.out.println("Addition: " + sum);
    }
    public static void calAddition(double  n1, double n2)
    {
        double sum = n1 + n2;
        System.out.println("Addition: " + sum);
    }
    public static void calAddition(double  n1, double n2, double n3)
    {
        double sum = n1 + n2 + n3;
        System.out.println("Addition: " + sum);
    }
    public static void calAddition(double  n1, int n2)
    {
        double sum = n1 + n2;
        System.out.println("Addition: " + sum);
    }
    public static void calAddition(int  n1, double n2)
    {
        double sum = n1 + n2;
        System.out.println("Addition: " + sum);
    }


    public static void main(String[] args) {
        calAddition(10, 20);
        calAddition(4, 5, 6);
    }
}
