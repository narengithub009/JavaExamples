package com.java.temp;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] arr=new int[5];

        int[] arr1= Arrays.copyOf(arr,arr.length);

        arr1[2]=23;
        for(int i:arr){
            System.out.print(i+" ");
        }

        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
