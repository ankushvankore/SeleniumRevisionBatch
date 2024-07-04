package com.ConditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int amt = scn.nextInt();
        double dis = 0, net;

        if(amt < 1000)
        {
            dis = amt * 0.020;
        }
        else
        {
            if(amt >= 1000 && amt < 3000)
            {
                dis = amt * 0.05;
            }
            else
            {
                if(amt >= 3000 && amt < 5000)
                {
                    dis = amt * 0.10;
                }
                else
                {
                   dis = amt * 0.15;
                }
            }
        }
        net = amt - dis;
        System.out.println("Discount: " + dis);
        System.out.println("Net Amt : " + net);
    }
}
