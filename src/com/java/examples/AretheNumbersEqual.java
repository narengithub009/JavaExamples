package com.java.examples;

public class AretheNumbersEqual {
    public static boolean verifyNumbers(int a, int b){
        if(a==b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(AretheNumbersEqual.verifyNumbers(3,2));
    }
}
