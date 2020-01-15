package com.java.tutorial.example003;

/**
 * This is a challenge exercise which utilizes knowledge of primitive types
 */
public class Tester {
    public static void main(String[] args) {
        byte myByteValue = 125;
        short myShortValue = 12000;
        int myIntValue = 1677;
        long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);

        System.out.println("The final long value = " + myLongValue);
    }
}
