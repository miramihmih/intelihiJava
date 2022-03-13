package com.company.com.syntax;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar Is Great");//original string
        s.concat("hahah");//add new String hahha to the original string
        // System.out.println(s.concat("hahah"));
        System.out.println(s);//printing out the original string

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");//original string

        stringBuilder.append("Hahha");//add new String Hahha to the String
        // System.out.println(stringBuilder.append("Hahha"));
        System.out.println(stringBuilder);//printing out the original string
    }
}
