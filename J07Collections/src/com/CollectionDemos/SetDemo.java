package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args) {
        Set<String>students = new HashSet<>();
        students.add("Sarvesh");
        students.add("Vaishali");
        students.add("Monu");
        students.add("Vaishali");
        students.add("Ruchi");

        System.out.println("Total Elements: " + students.size());

        System.out.println(students);
    }
}
