package com.java.example2;

import com.java.collections.ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesBelowaGivenNumber {
    public static void main(String[] args) {

        PrimesBelowaGivenNumber.primesBelowNum(20);
    }

    private static void primesBelowNum(int i) {

        ArrayList<Integer> list=new ArrayList<>();

        for (int k=2;k<=i;k++) {
            boolean isPrime=true;
            for (int j = 2; j <= k/2; j++) {
                if (k % j == 0) {
                    isPrime=false;
                    break;

                }
            }
            if(isPrime==true){
                list.add(k);
            }
        }
        int arr[]=list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
