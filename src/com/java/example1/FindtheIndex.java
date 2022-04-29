package com.java.example1;

public class FindtheIndex {
    public static void main(String[] args) {
        int index = FindtheIndex.findIndex(new int[]{2, 3, 4, 5}, 0);
        System.out.println(index);
    }

    private static int findIndex(int[] ints, int i) {

        for(int n=0;n<ints.length;n++){
            if(ints[n]==i){
                return n;
            }
        }
        return -1;
    }
}
