package com.ExceptionDemos;

import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Index: ");
        int i = scn.nextInt();

        try {
            System.out.println(arr[i]);
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex);
        }
        catch (Exception ex)
        {
            System.out.println("Array index is out of bound!!!");
        }

        System.out.println("Program Ends!!!");
    }
}
