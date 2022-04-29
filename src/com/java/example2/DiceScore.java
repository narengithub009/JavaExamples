package com.java.example2;


import java.util.HashMap;
import java.util.Map;


public class DiceScore {


    public static void main(String[] args) {
        int i = DiceScore.diceScore(new int[]{2, 1, 1, 3, 2});
        System.out.println(i);
    }

    private static int diceScore(int[] ints) {

        int count = 0;
        int pre = ints[0];
        Map<Integer, Integer> score = new HashMap<>();
        score.put(1, 1000);
        score.put(2, 200);
        score.put(3, 300);
        score.put(4, 400);
        score.put(5, 500);
        score.put(6, 600);
        score.put(11, 100);
        score.put(15, 50);

        int totalScore;
        int groupScore = 0;
        int fiveScore = 0;
        int oneScore = 0;
        boolean flag=false;
        for (int anInt : ints) {

            // temp = ints[i];
            if (anInt == pre) {
                count++;
                if (count == 3) {
                    groupScore = score.get(anInt);
                    flag=true;
                }
            }
            pre = anInt;

        }

        for (int anInt : ints) {

            if (anInt == 5&& flag == false) {
                fiveScore = fiveScore + score.get(15);
            } else if (anInt == 1 && flag == false) {
                oneScore = oneScore+score.get(11);
            }
        }



    totalScore=groupScore+fiveScore+oneScore;
        //System.out.println(totalScore);
        return totalScore;

    }
}
