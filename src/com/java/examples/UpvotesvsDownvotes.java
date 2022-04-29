package com.java.examples;

public class UpvotesvsDownvotes {
    public static int getTotalVotes(int upVotes, int downVotes){

        return (upVotes-downVotes);
    }
    public static void main(String[] args) {

        System.out.println(UpvotesvsDownvotes.getTotalVotes(2,32));
    }
}
