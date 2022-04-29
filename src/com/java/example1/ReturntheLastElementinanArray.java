package com.java.example1;

public class ReturntheLastElementinanArray {
    public static void main(String[] args) {
        System.out.println(ReturntheLastElementinanArray.lastElement(new int[]{43, 4, 5, 6, 6, 6, 67, 78, 88}));

    }

    private static int lastElement(int[] arr) {

        return  arr[(arr.length)-1];
    }
}
