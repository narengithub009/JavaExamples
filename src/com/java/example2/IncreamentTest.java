package com.java.example2;

public class IncreamentTest {
    public static void main(String[] args) {

        int i=0;
        int num=5;
        while (i<4) {

            num = (i++ * num);
            System.out.println(num);
        }
    }
}
