package com.java.example2;

public class FindtheSharedLettersbetweenTwoStrings {

    public static void main(String[] args) {
        FindtheSharedLettersbetweenTwoStrings.sharedLetters("Narender", "neeraja");
    }

    private static void sharedLetters(String s, String s1) {

        char[] c=s.toCharArray();
        char[] c1=s1.toCharArray();
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
            for(int j=0;j<s1.length();j++) {
                c1[j] = s1.charAt(j);
                if (c[i] == c1[j]) {
                    System.out.print(s.charAt(i));
                }
            }
        }

    }

}
