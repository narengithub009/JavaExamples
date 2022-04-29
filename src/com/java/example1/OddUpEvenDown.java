package com.java.example1;

import java.util.Arrays;

public class OddUpEvenDown {
    public static void main(String[] args) {
        OddUpEvenDown.oddUpEvenDown(new int[]{1,2,3,4,4});

    }
    static int[] i1;

    private static void oddUpEvenDown(int[] ints) {
        i1=new int[ints.length];
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
            if(ints[i]%2==0){
                i1[i]=ints[i]-1;
            }else{
                i1[i]=ints[i]+1;
            }
        }
        System.out.println(Arrays.toString(i1));
    }
}
