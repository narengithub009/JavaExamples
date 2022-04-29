package com.java.example1;

import java.util.Arrays;

public class FindtheSmallestandBiggestNumbers {
    public static void main(String[] args) {
        FindtheSmallestandBiggestNumbers.findSmalAndBig(new int[]{2,3,4,53,53,5444});
    }

    private static void findSmalAndBig(int[] ints) {

        int[] result= Arrays.stream(ints).sorted().toArray();
        System.out.println(result[0]+"  "+result[result.length-1]);
    }
}
