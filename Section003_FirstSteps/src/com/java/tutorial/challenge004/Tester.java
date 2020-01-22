package com.java.tutorial.challenge004;

/**
 * Convert number of pounds to kilograms
 * 1 pound = 0.45359237 kilograms
 */
public class Tester {
    public static void main(String[] args) {
        double numberOfPounds;
        numberOfPounds = 5.67;
        double numberOfKilograms;
        numberOfKilograms = 0.45359237 * numberOfPounds;
        System.out.println("Number of pounds = " + numberOfPounds);
        System.out.println("Number of kilograms = " + numberOfKilograms);
    }
}
