package com.java.example1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumPossibleTotal {

    public static void main(String[] args) {
        int sum = MaximumPossibleTotal.maxsum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(sum);
    }

    private static int maxsum(int[] ints) {

        int[] sorted = Arrays.stream(ints).sorted().toArray();
        System.out.println(Arrays.toString(sorted));
        int count = 0;
        int sum = 0;
        for (int i = sorted.length - 1; i >= 0; i--) {

            sum = sum + sorted[i];
            count++;
            if (count == 5) {
                break;
            }
        }
        return sum;
    }
}
