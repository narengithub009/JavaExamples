package com.java.example2;

public class CountSyllables {

    public static void main(String[] args) {

        int i = CountSyllables.numberSyllables("on-o-mat-o-poe-ia");
        System.out.println(i);

    }

    private static int numberSyllables(String s) {
        int count=0;
        char ch;
        for (int i=0;i<s.length();i++){

            ch=s.charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    count++;

            }
        }
        return count;
    }
}
