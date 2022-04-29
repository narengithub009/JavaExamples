package com.java.example1;

import java.util.Arrays;

public class BuggyCode {

    public static void main(String[] args) {
        System.out.println(BuggyCode.printArray(6));
    }

    private static String printArray(int i) {
        int arr[] = new int[i];
        for(int j=0;j<i;j++){
            arr[j]=j+1;
        }
        return Arrays.toString(arr);
    }
}
