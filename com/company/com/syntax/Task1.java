package com.company.com.syntax;

public class Task1 {
    public static void main(String[] args) {
       /*
       * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        */
        String s="This is a sentance";
        String newStr=s.replace(" ", " ");
        System.out.println(newStr);
    }
}