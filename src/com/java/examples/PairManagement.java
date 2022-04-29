package com.java.examples;

import java.util.Arrays;

public class PairManagement {

    public static void main(String[] args) {
        PairManagement.pairToArray(51,21);

    }

    private static int[] pairToArray(int i, int i1) {
        int arr[]={i,i1};
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
