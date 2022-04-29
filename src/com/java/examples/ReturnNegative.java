package com.java.examples;

public class ReturnNegative {

    public static void main(String[] args) {
        System.out.println(ReturnNegative.returnNegNumber(-0));
    }

    private static int returnNegNumber(int i) {

        if(i>0){
            return -i;
        }else if (i<0){
            return i;
        }
        else return 0;
    }
}
