package com.java.lambda;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample1 {
    public static void main(String[] args) {
        String[] stringArray={"ab","ef","cd"};

        Arrays.sort(stringArray, StringArraySort::sortMethod);
        for(String str:stringArray){
            System.out.println(str +" ");
        }
    }

}

class StringArraySort{

    public static int sortMethod(String a, String b){

        return  a.compareTo(b);
    }
}