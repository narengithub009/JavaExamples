package com.java.example2;

import java.util.Scanner;

public class IsVowelOrConsonant {

    public static void main(String[] args) {

        boolean isVowel=false;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter character :");
        char ch=scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        if (isVowel){
            System.out.println(ch+" is vowel");

        }else {
            if ((ch>'a'&&ch<'z')||(ch>'A'&&ch<'Z')){
                System.out.println(ch +" is consonant");
            }else {
                System.out.println("The given value is not character");
            }
        }

    }
}
