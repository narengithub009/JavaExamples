package com.java.example1;

public class RecursionSum {

    public static void main(String[] args) {
        int sum = RecursionSum.sum(12);
        System.out.println(sum);
    }

    private static int sum(int n) {
        int sum=0;
        for (int i=1;i<=n;i++){

            sum+=i;
        }
        return sum;
    }
}
