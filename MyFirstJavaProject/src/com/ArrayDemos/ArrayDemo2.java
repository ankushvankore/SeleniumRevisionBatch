package com.ArrayDemos;

import java.util.Arrays;

public class ArrayDemo2
{
    public static void main(String[] args) {
        int[] marks = new int[] {95, 25, 65, 75, 68, 67, 52, 48};

        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println();
        Arrays.sort(marks);

//        for(int i = 0; i < marks.length; i++)
//            System.out.println(marks[i]);

        for(int m : marks)
            System.out.println(m);

    }
}
