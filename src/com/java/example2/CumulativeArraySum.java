package com.java.example2;

import java.util.Arrays;

public class CumulativeArraySum {

    public static void main(String[] args) {

        int[] ints = CumulativeArraySum.arraySum(new int[]{3, 3, -2, 408, 3, 3});

        System.out.println(Arrays.toString(ints));
    }

    private static int[] arraySum(int[] ints) {
        int pre=0;
        for(int i=0;i<ints.length;i++){

            pre=pre+ints[i];
            ints[i]=pre;
        }
        return ints;
    }


}
