package com.java.example1;

public class SimilarBread {

    static String[] bread1= {"white bread", "lettuce", "white bread"};
    static String[] bread2= {"white bread", "tomato", "white bread1"};

    public static void main(String[] args) {

        boolean b = SimilarBread.hasSimilarBread(bread1, bread2);
        System.out.println(b);
    }

    private static boolean hasSimilarBread(String[] bread1, String[] bread2) {

        return bread1[0].equalsIgnoreCase(bread1[bread1.length-1])&&
                bread2[0].equalsIgnoreCase(bread2[bread2.length-1]);
    }
}
