package com.company.com.syntax;

public class Task3 {
    public static void main(String[] args) {
        /*
         *You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
         * How would you find out how many sentences are in that String?
         */
        String a="Is is Saturday? Is it raining? Do we have a Java Class today?";
        //string class method to count the number of characters in a class
        System.out.println(a.length());
        //length property that we can use o check the number of elements in an array
        System.out.println(a.split("[?.!]").length);
        int[] arr={10,10};
        System.out.println(arr.length);





    }
}
