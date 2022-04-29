package com.java.examples;



public class FootballPoints {
    public static int win=3,draw=1,lost=0;

    public static void main(String[] args) {
        FootballPoints.totalPoints(3,4,0);
    }

    public static int totalPoints(int teamWins, int teamDraws, int teamLost) {
        int totalPoints = ((teamWins*win)+(teamDraws*draw)+(teamLost*lost));
        System.out.println(totalPoints);
        return totalPoints;
    }
}




