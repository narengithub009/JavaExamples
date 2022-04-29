package com.java.example1;

public class CaseInsensitiveComparison {

    public static void main(String[] args) {
        boolean compare = CaseInsensitiveComparison.compare("Narender", "narender");
        System.out.println(compare);
    }

    public static boolean compare(String s, String s1){
        return s.equalsIgnoreCase(s1);
    }

}
