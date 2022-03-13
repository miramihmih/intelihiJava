package com.syntax.class19;

public class Cow {

    /*
     *the constructor that is provided automatically when we \
     * don't create any constructors in a class is called
     * Default Constructor
     */

    static int normalNumberOfLegs=4;
    /*
     *when we don't assign values to the instance fields
     * java assigns default values to these fields
     * int=0;
     * double=0.0;
     * class objects with null
     * boolean with =false
     * chars \u0000
     */
    private String name;
    int age;
    double weight;
    String breed;
    char gender='\u263A';
    /*
     *below is zero argument or no argument constructor
     */

    Cow(){
        /*
         * U might want to execute some code to set up the resources
         * for ur class like opening the connections
         * to database checking it internet is available eor not etc
         */
    }
    void printName(){

        System.out.println(gender);

    }

}
