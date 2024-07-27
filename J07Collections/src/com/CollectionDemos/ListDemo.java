package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sarvesh");
        students.add("Vaishali");
        students.add("Monu");
        students.add("Vaishali");

        System.out.println("Total Elements: " + students.size());

//        System.out.println(students.get(0));
//        System.out.println(students.get(1));
//        System.out.println(students.get(2));
//        System.out.println(students.get(3));

//        for(int i = 0; i < students.size(); i++)
//            System.out.println(students.get(i));

        for(String st : students)
            System.out.println(st);

        System.out.println(students);
    }
}
