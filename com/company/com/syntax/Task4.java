package com.company.com.syntax;

public class Task4 {
    public static void main(String[] args) {

        /*
         * How would you reverse a String word by word? for example
         *	// input=>This is sentence I want to reverse
         *	// output=>sihT si ecnetnes i tnaw ot esrever
         */
        StringBuilder stringBuilder=new StringBuilder("Sunday is Great");
        System.out.println(stringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);



    }
}