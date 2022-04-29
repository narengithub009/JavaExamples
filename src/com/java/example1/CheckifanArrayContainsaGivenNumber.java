package com.java.example1;

import java.util.Arrays;

public class CheckifanArrayContainsaGivenNumber {
    public static void main(String[] args) {
        boolean givenNumber = CheckifanArrayContainsaGivenNumber.findGivenNumber(new int[]{2, 3, 4, 5, 5, 5}, 6);
        System.out.println(givenNumber);
    }

    private static boolean findGivenNumber(int[] ints, int j) {
        /*for(int i=0;i<ints.length;i++){
            if(ints[i]==j){
                return true;
            }
        }*/

        /*for(int anInt:ints){
            if(anInt==j){
                return true;
            }
        }*/
        return Arrays.stream(ints).anyMatch(ints1->ints1==j);
    }
}
