package it.develhope.whileloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------Starting----------------------");

        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        int i=0;
        while (i<fibonacciNumbers.size()){
            System.out.println(fibonacciNumbers.get(i));
            i++;}

        System.out.println("---------------------------------------------");
    }
}
