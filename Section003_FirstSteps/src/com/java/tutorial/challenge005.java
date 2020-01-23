package com.java.tutorial;

public class challenge005 {
    public static void main(String[] args) {
        double myDoubleOne = 20.00;
        double myDoubleTwo = 80.00;
        double result = (myDoubleOne + myDoubleTwo) * 100.00;
        System.out.println("Result = " + result);
        double remainder = result % 40.00;
        System.out.println("Remainder = " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("isZero = " + isZero);
        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}
