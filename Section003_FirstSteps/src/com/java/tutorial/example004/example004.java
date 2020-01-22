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

        int myIntValue = 5/3;
        float myFloatValue = 5f / 3f; //the f is required at the end otherwise an error will be highlighted
        double myDoubleValue = 5d / 3d; //here d is optional as by default a decimal number is treated as double
        double myNewDoubleValue = 5.00 / 3.00; //here also the numeric literals are treated as double values

        System.out.println("My int value = " + myIntValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value = " + myDoubleValue);
        System.out.println("my new double value = " + myNewDoubleValue);

    }
}
