package com.java.lambda.expressions;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {

    public static void main(String[] args) {

        String[] str={"abc","hijz","efg"};

        Arrays.sort(str, (String a, String b)->{
            return a.compareTo(b);
        });

        for(String str1:str){
            System.out.println(str1+" ");
        }
    }
}
