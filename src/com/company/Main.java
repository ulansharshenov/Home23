package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        Random rnd  = new Random();

        for (int i = 1; i <= 50; i++){
            numbers.add(rnd.nextInt(100));
        }

        for (Integer i: numbers) {
            if (i % 2 == 0){
                evenNumbers.add(i);
            }else
                oddNumbers.add(i);
        }
        System.out.println("Numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
