package com.java.example2;

import java.util.Arrays;

public class ArrayofMultiples {

    public static void main(String[] args) {
        ArrayofMultiples.arrayOfMultiples(12, 10);
    }

    private static void arrayOfMultiples(int i, int i1) {
      //  int sum=0;
        int[] sum=new int[i1];
        int temp=0;
        for(int i2=0;i2<i1;i2++){
            sum[i2]=i+temp;
            temp=sum[i2];
        }
        Arrays.stream(sum).forEach(System.out::println);
    }
}
