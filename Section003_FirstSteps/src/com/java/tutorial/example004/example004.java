package com.java.tutorial.example004;

/**
 * This deals with float and double numbers
 */
public class example004 {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinDoubleValue);
        System.out.println("Float maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f; //the f is required at the end otherwise an error will be highlighted
        double myDoubleValue = 5.25; //here d is optional as by default a decimal number is treated as double
    }
}
