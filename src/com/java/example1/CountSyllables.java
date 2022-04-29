package com.java.example1;

public class CountSyllables {

    public static void main(String[] args) {
        int i = CountSyllables.countSyllabus("telugu-hindhi-english");
        System.out.println(i);
    }

    private static int countSyllabus(String s) {

        String[] str=s.split("-");
        return str.length;
    }
}
