package it.develhope.whileloop;

/**
 * This is a Tester Class
 * @author alessiolimina
 */

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------Printing Fibonacci Numbers----------------------");

        /**
         * Declaring the variables
         * i is the value from we start to iterate
         * firstNumber is the first number
         * secondNumber is the secondNumber
         */

        int i = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        /**
         * Creating a WHILE Loop
         * Printing the firstNumber
         * nextNumber is a new variable, that is the sum between firstNumber and secondNumber
         * Assigning to firstNumber the value of secondNumber
         * Assigning to secondNumber the value of nextNumber
         * Repeat until the end of loop
         */

        while(i<10){
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            i++;}

        System.out.println("---------------------------------------------");
    }
}
