package com.syntax.class17;

public class HealthyDog {
    //when the info is expected to be diff from object to object
    //we store that info in an instance variable
    String name;//instance
    String color; //instance
    //if we know that a value will stay same for all the objects of a class
    //we create a static variable for that why because
    static int numberOfLegs=4; //static
    void eat(){
        int noOfTimes=3;//local
        System.out.println(name+ "eats"+noOfTimes);
    }
    public static void main(String[] args){
        HealthyDog dog=new HealthyDog();//local
        dog.name="scooby";
        dog.color="white";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tommy";
        dog2.color="black";
        System.out.println(HealthyDog.numberOfLegs);
        dog2.eat();






    }


}
