package com.java.example1;



public class ArrayIndexing {

    public static void main(String[] args) {

        ArrayIndexing.arrayIndexing(new int[]{2,3,4,5,6},4/2);
    }

    private static void arrayIndexing(int[] ints, double i)  {
        try{
        int index= (int) Math.floor(i);
            System.out.println(ints[index]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array size must below "+ints.length);
        }


    }
}
