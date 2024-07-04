package com.ArrayDemos;

public class StringDemos
{
    public static void main(String[] args) {
        //char name = 'V';
        String name = "Vaishali";

        System.out.println(name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Name: " + name);
        System.out.println("Index of s: " + name.indexOf("s"));

        String str1 = "Vaishali", str2 = "Ruchi";

        if(str1.equals(str2))
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

        str1 = "ruchi";

        if(str1.equals(str2))
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

        if(str1.equalsIgnoreCase(str2))
            System.out.println("Both are equal Ignoring the case");
        else
            System.out.println("Both are not equal");

        String expUrl = "https://www.google.com";

        if(expUrl.contains("Google"))
            System.out.println("Test case pass");
        else
            System.out.println("Test case fail");

        System.out.println(expUrl.toUpperCase());
    }
}
