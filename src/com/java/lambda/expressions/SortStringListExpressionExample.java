package com.java.lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringListExpressionExample {
    public static void main(String[] args) {

        String[] str={"ab","ef","cd"};

        List<String> list= Arrays.asList(str);
        Collections.sort(list, (a,b)->a.compareTo(b));
        for(String s:list){
            System.out.println(s);
        }

        System.out.println(list);
    }
}
