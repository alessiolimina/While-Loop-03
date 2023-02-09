package it.develhope.whileloop;


public class Start {
    public static void main(String[] args) {

        System.out.println("---------------Starting----------------------");

        int i = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        while(i<10){
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            i++;
        }

        System.out.println("---------------------------------------------");
    }
}
