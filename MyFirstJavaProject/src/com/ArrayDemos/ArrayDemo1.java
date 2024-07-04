package com.ArrayDemos;

public class ArrayDemo1
{
    public static void main(String[] args) {
        int no1 = 44;
        int[]marks = new int[5];

        marks[0] = 54;
        marks[1] = 53;
        marks[2] = 84;
        marks[3] = 87;
        marks[4] = 74;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        for(int i = 0; i < 5; i++)
            System.out.println(marks[i]);
    }
}
