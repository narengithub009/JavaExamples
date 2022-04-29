package com.java.lambda;

import java.util.Arrays;

public class ReferenceToInstanceMethodOfArbitraryObjectOfParticularType {
    public static void main(String[] args) {

        String[] str={"ef","ab","cd"};
        Arrays.sort(str, String::compareToIgnoreCase);

        for(String str1:str){
            System.out.print(str1+" ");

        }
    }
}
