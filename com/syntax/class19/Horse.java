package com.syntax.class19;

public class Horse {
    private String name;
    private int age;
    private double weight;

    //no argument constructor or zero argument con-tor.
    //Horse(){
    /*
     *write some imp lines of code that u want to execute when
     * the object of a class is created for example
     * U might want to fetch some from internet  or from ur hard dick to give initial values of the field.
     */

    //purpose of constructor is to give initial values to the fields of class
    Horse(String horseName,int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    //Rule #1: Constructor don't have RETURN types like int String not even void
    /*
     *Horse(String horseName,int horseAge, double horseWeight){
     *name=horseName;
     *age=horseAge;
     *weight=horseWeight;
     */

    //Rule #2: Name of the constructor should be same as name of the class
    /*
     *Horse(String horseName,int horseAge, double horseWeight){
     *name=horseName;
     *age=horseAge;
     *weight=horseWeight;
     */

    void printHorseName(){
        System.out.print("Name "+ name);
    }
    void setName(String horseName){
        name=horseName;
    }
}
