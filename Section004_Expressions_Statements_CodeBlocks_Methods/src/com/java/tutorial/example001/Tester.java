package com.java.tutorial.example001;

/**
 * We will discuss expressions in this program
 */
public class Tester {
    public static void main(String[] args) {
        //a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
        }

        //A small challenge
        //In the following code that I will type below, write down what parts of the code
        //are expressions.
        int score = 100;
        if(score > 99){
            System.out.println("You got the high score");
            score = 0;
        }
    }
}
