package com.java.lambda.expressions;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayWithoutLambdaExpressionExample {
    public static void main(String[] args) {

        class StringSorting implements Comparator<String>{
             @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }

        String[] str={"cd","ef","ab"};

        Arrays.sort(str,new StringSorting());

        for (String str1:str) {
            System.out.println(str1 +" ");
        }
    }
}
