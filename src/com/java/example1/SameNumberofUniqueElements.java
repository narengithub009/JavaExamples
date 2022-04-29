package com.java.example1;

import java.util.Arrays;

public class SameNumberofUniqueElements {

    public static void main(String[] args) {
        boolean same = SameNumberofUniqueElements.same(new int[]{1, 2,4, 3, 3}, new int[]{2, 3, 4, 5});
        System.out.println(same);
    }

    public static boolean same(int[] z, int[] y){


        return Arrays.stream(z).distinct().count()==Arrays.stream(y).distinct().count();
    }
}
