package com.java.tutorial.example001;

/**
 * A simple Hello World program to get you started showing how to use variables and
 * how expressions are evaluated
 */

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println("myTotal = " + myTotal);

        int myLastOne = 1000 - myTotal;
    }
}

