package com.java.lambda;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {

    public static void main(String[] args) {

        String[] str={"cd","ef","ab"};
        StringSort stringSort=new StringSort();

        Arrays.sort(str, stringSort::stringSortMethod);
        for(String str1:str){
            System.out.println(str1 +" ");
        }
    }
}
class StringSort{
    
    public int stringSortMethod(String a, String b){
        return a.compareTo(b);
    }
}