package com.java.tutorial.example002;

/**
 * Here we will have a look at the 8 java primitive types int, byte, short, long, char, boolean, double
 */
public class Tester {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myNewMaxIntNumber = 2_147_483_647; //We can type the same value by using underscore to separate the decimal spaces
                                               //number remaining the same.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        //Casting demonstration usecase
        int myTotal = (myMinIntValue / 2); //This is ok

        //but this is not
        //byte myTotalNew = (myMinIntValue / 2); The expression within parentheses is being treated as an integer hence casting is needed

        //We will rewrite this line as
        byte myTotalNew = (byte)(myMinIntValue / 2); //This is what casting is

        //Same problem can also be seen in short data type
        //short myTotalShort = (myMinShortValue / 2); The expression within parenthese is being treated as an integer hence casting is needed

        //We will rewrite this line as
        short myTotalShort = (short)(myMinShortValue / 2); //This is again what casting is

    }
}
