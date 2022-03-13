package com.synax.class22;

import org.omg.Messaging.SyncScopeHelper;

public class IfElseDemo {
    public static void main(String[] args){
        int number=10;
        /*
         *the ternary operator has the limitation that is must return smth we can't use it to print out things
         */
        //number>10? System.out.println("Number is greater"): System.out.println("Number is smaller")
    }
    int maxNumber(int num1, int num2) {
        //if(num1>num2){
        //return num1;
        // }else{
        //return num2;
        // }
        return num1 > num2 ? num1 : num2;
        //num1>num2=> the condition part
    }
}
