package com.java.example2;

public class ArrayIndexing {
    public static void main(String[] args) {
        int i = 10 / 2;
        int i1 = ArrayIndexing.valueAt(new int[]{1, 2, 3, 4}, (int) (6.535355314 / 2));
        System.out.println(i1);
    }

    private static int valueAt(int[] ints, int i) {

        return ints[(int) Math.floor(i)];
    }
}
