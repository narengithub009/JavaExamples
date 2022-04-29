package com.java.temp;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {

        String[] str=new String[]{"NAREN","FUNNY","ANNY"};

       List<String> list = Arrays.asList(str);

       for(String s : list){
           System.out.print(s+"  ");
        }


       int[] arr=new int[5];
        Arrays.fill(arr,9);
       for (int i:arr){
           System.out.print(i);
       }
    }
}
