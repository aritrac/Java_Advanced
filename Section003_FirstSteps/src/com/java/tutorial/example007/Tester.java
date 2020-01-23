package com.java.tutorial.example007;

/**
 * this part deals with operators, operands and expressions
 * we will also discuss about if-then statements,logical && and || operators
 * Assignment and equals operator, ternary operator
 */
public class Tester {
    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;//3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;//2 * 10 = 20
        System.out.println("result = " + result);

        result = result / 5;//20 / 5 = 4
        System.out.println("result = " + result);

        result = result % 3;
        System.out.println("result = " + result);

        //result = result + 1
        result++;//1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3;    //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = true;

        //single line execution
        if(isAlien == false)
            System.out.println("It is not an alien");

        //executing multiple lines under the if statement
        if(isAlien){
            System.out.println("This is the first line");
            System.out.println("This is the second line");
        }

        int topScore = 100;
        if(topScore != 100){
            System.out.println("You haven't got the high score!");
        }
        if(topScore > 100){
            System.out.println("You got more than top score!");
        }
        if(topScore == 100){
            System.out.println("You have got the high score");
        }
        if(topScore >= 100){
            System.out.println("You may have got equal to or more than the high score!");
        }

        topScore = 80;

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions is true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar = true){
            System.out.println("This is not supposed to happen");
        }

        if(isCar){
            System.out.println("This will be printing");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
