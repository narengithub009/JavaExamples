package com.java.example1;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class ReturntheIndexoftheFirstVowel {
    static char ch;
    public static void main(String[] args) {
        ReturntheIndexoftheFirstVowel.firstVowel("apple");
    }

    private static String firstVowel(String str) {


        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.println("index :" +i+" Vowel "+str.charAt(i));
            }
        }
        return "No vowel in the given String";
    }
}
