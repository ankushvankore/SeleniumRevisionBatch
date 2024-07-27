package com.CollectionDemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args) {
        Map<Integer, String>students = new HashMap<>();
        students.put(1, "Vaishali");
        students.put(2, "Ruchi");
        students.put(3, "Sarvesh");
        students.put(4, "Monu");
        students.put(2, "Ankush");
        students.put(5, "Vaishali");

        System.out.println(students);
    }
}
