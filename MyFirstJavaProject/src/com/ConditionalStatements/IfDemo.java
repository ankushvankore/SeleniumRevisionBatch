package com.ConditionalStatements;

public class IfDemo {
    public static void main(String[] args) {
        int amt = 1999;
        double dis = 0, net;

        if(amt >= 1000)
        {
            dis = amt * 0.10;
        }
        net = amt - dis;
        System.out.println("Discount: " + dis);
        System.out.println("Net Amt : " + net);
    }
}
