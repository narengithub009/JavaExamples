package com.java.example2;

import java.util.stream.IntStream;

public class EvenNumberGenerator {

    public static void main(String[] args) {

        EvenNumberGenerator.findEvenNums(8);
    }

    private static void findEvenNums(int n) {

        for(int i=1; i<=n;i++){

            if(i%2==0){
                System.out.println(i);
            }
        }


    }
}
