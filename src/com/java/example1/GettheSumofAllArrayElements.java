package com.java.example1;

import java.util.Arrays;

public class GettheSumofAllArrayElements {

    public static void main(String[] args) {
        long i = GettheSumofAllArrayElements.sumOfArrayElements(new int[]{1, 2, 3, 4, 5, 5, 5});
        System.out.println(i);
    }

    public static long sumOfArrayElements(int[] arr){

        return Arrays.stream(arr).count();
    }
}
